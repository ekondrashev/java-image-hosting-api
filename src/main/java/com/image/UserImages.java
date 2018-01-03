package com.image;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserImages implements ImageList {

    ImageList list;
    User user;

    public UserImages(ImageList list,  User user) {
        this.list = list;
         this.user = user;
    }

    @Override
    public void addImage(Image image) {
        list.addImage(image);
    }

    @Override
    public Iterator<Image> iterator() {

        List<Image> result = new ArrayList<>();

        for (Image image : list) {
            if(image.getUser().equals(user))
            {
                result.add(image);
            }
        }

        return result.iterator();
    }
}
