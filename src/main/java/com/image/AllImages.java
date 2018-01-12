package com.image;

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

    static final Logger LOG = Logger.getLogger(Logs.class.getName());

    @Override
    public void add(Image image) {

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


        LOG.info("Add new url in progress for save: " + image.URL());

        Extension extension = getExtention(image.URL());

        BufferedImage bufferedImage = ImageIO.read(new URL(image.URL()));

        String newFileName = Extension.path() + "\\" + image.User().getName() + "\\image " + System.currentTimeMillis() + "." + extension;
        ImageIO.write(bufferedImage, extension.toString(), new File(newFileName));

        LOG.info("User " + image.User().getName() + " saved new picture with name: " + newFileName);


    }


}
