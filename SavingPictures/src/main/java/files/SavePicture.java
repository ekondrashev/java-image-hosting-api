package files;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
import setup.Setup;


public class SavePicture {


    static String pathToSave = new Setup().getPATH();

    public void write(URL url, String name) throws IOException {

        char[] ex = url.toString().toCharArray();

        String extension = "";

        for (int i = ex.length - 1; i > 0; i--) {
            extension = ex[i] + extension;
            System.out.printf(extension);
            if (ex[i] == '.') {
                break;
            }
        }

        BufferedImage image = null;
        image = ImageIO.read(url);
        if (image != null) {
            ImageIO.write(image, "jpg", new File(pathToSave + "\\image " + name + " " + System.currentTimeMillis() + extension));
        }
    }

}

