package com.image;

import java.util.Iterator;
import java.util.List;

public class LocalImageList implements ImageList {


    private List<Image> imagesList;

    @Override
    public void addImage(Image image) {
        this.imagesList.add(image);
    }

    public Iterator<Image> iterator() {
        return imagesList.iterator();
    }


}
