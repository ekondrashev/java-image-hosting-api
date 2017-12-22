package files;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import java.util.logging.Logger;
import log.Logs;
import objects.UrlValidator;
import setup.Setup;

public class SavePicture implements Save {

    static String pathToSave = new Setup().getPATH();

    public void write(UrlValidator urlValidator, String userName) throws IOException {
        Logger log = Logger.getLogger(Logs.class.getName());

        if (urlValidator.getUrl() != null) {

            log.info("Add new url in progress for save: " + urlValidator.getUrl());

            String newFileName = "";

            BufferedImage image = null;
            image = ImageIO.read(urlValidator.getUrl());
            if (image != null) {
                newFileName = pathToSave + "\\image " + System.currentTimeMillis() + urlValidator.getExtension();
                ImageIO.write(image, urlValidator.getFormatName(), new File(newFileName));
            }

            log.info("User " + userName + " saved new picture with name: " + newFileName
                    + " CheckForFileSaved " + new CheckForFileSaved().test(newFileName));
            log.info(" test for file whole color model: " + new CheckForFileWholeColorModel().testWhole(newFileName, image));
        }

        else  log.info(" url is not correct: " + urlValidator.getUrl());
    }

}

