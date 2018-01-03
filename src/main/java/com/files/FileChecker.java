package com.files;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class FileChecker {

    String filepath;

    public FileChecker(String filepath) {
        this.filepath = filepath;
    }

   public boolean checkForSave() {

       return new File(filepath).exists();
    }

    public boolean checkForColorModel(BufferedImage image)
    {
        BufferedImage screen = null;
        try {
            screen = ImageIO.read(new File(filepath));
        } catch (IOException e) {
        }
        BufferedImage screen2 = image;

        if (screen.getColorModel().equals(screen2.getColorModel()))
        {return true;
        }
        else return false;
    }

}
