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
    static final Logger LOG = Logger.getLogger(Logs.class.getName());;

    public ValidateImages(Images images) {
        this.images = images;
    }

    @Override
    public void add(Image image) {

        LOG.info("Add new url in progress for validation: " + image.URL());


        Extension extension = getExtention(image.URL());

        if (extension.isExtensionOK()) {
            images.add(image);
        } else {
            throw new ExtensionNotSupported();
        }
    }

    @Override
    public Iterator<Image> iterator() {
        return images.iterator();
    }
}
