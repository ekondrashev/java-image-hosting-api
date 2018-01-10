package com.image;

import com.files.FileChecker;
import com.log.Logs;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

public class AllImages implements Images {

    private List<Image> imagesList = new ArrayList<>();

    @Override
    public void addImage(Image image) {

        try {
            write(image);
            this.imagesList.add(image);
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public Iterator<Image> iterator() {
        return imagesList.iterator();
    }


    public void write(Image image) throws IOException {
        Logger log = Logger.getLogger(Logs.class.getName());

        if (image.getURL() != null) {

            log.info("Add new url in progress for save: " + image.getURL());

            Extension extension = getExtention(image.getURL());

            BufferedImage bufferedImage = ImageIO.read(new URL(image.getURL()));

            if (bufferedImage != null) {
                String newFileName = Extension.path() + "\\" + image.getUser().getName() + "\\image " + System.currentTimeMillis() + "." + extension;
                ImageIO.write(bufferedImage,  extension.toString(), new File(newFileName));

                FileChecker fileChecker = new FileChecker(newFileName);

                log.info("User " + image.getUser().getName() + " saved new picture with name: " + newFileName
                        + " FileChecker " + fileChecker.checkForSave());
                log.info(" test for file whole color model: " + fileChecker.checkForColorModel(bufferedImage));
            }

            else log.info("Can not read image");
        }

        else  log.info(" url is not correct: " + image.getURL());
    }



}
