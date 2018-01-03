package com.image;

import com.files.AddressValidator;
import com.files.FileChecker;
import com.files.UrlValidator;
import com.log.Logs;
import com.setup.Setup;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class AllImages implements ImageList {

    private List<Image> imagesList = new ArrayList<>();

    @Override
    public void addImage(Image image) {

        AddressValidator validator = new AddressValidator();

        UrlValidator urlValidator = null;
        try {
            urlValidator = validator.validate(new URL(image.getURL()));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return;
        }

        try {
            write(urlValidator, image.getUser().getName());
            this.imagesList.add(image);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public Iterator<Image> iterator() {
        return imagesList.iterator();
    }

    static String pathToSave = new Setup().getPATH();

    public void write(UrlValidator urlValidator, String userName) throws IOException {
        Logger log = Logger.getLogger(Logs.class.getName());

        if (urlValidator.getUrl() != null) {

            log.info("Add new url in progress for save: " + urlValidator.getUrl());

            BufferedImage image = ImageIO.read(urlValidator.getUrl());

            if (image != null) {
               String newFileName = pathToSave + "\\" + userName + "\\image " + System.currentTimeMillis() + urlValidator.getExtension();
                ImageIO.write(image, urlValidator.getFormatName(), new File(newFileName));

                FileChecker fileChecker = new FileChecker(newFileName);

                log.info("User " + userName + " saved new picture with name: " + newFileName
                        + " FileChecker " + fileChecker.checkForSave());
                log.info(" test for file whole color model: " + fileChecker.checkForColorModel(image));
            }

            else log.info("Can not read image");
        }

        else  log.info(" url is not correct: " + urlValidator.getUrl());
    }


}
