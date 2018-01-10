package com.files;

import com.exeptions.ExtensionNotSupported;
import com.image.Extension;
import com.image.Image;
import com.image.Images;
import com.log.Logs;

import java.util.Iterator;
import java.util.logging.Logger;

public class ValidateImages implements Images {

    Images images;

    public ValidateImages(Images images) {
        this.images = images;
    }

    @Override
    public void addImage(Image image) {
        //  Setup setup = new Setup();

        Logger log = Logger.getLogger(Logs.class.getName());
        log.info("Add new url in progress for validation: " + image.getURL());

        //String extension = getExtention(image.getURL());

        Extension extension = getExtention(image.getURL());

        if (extension.isExtensionOK()) {
            images.addImage(image);
        } else {
            throw new ExtensionNotSupported();
        }
    }

    @Override
    public Iterator<Image> iterator() {
        return images.iterator();
    }
}
