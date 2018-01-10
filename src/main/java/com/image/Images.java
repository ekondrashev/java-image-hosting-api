package com.image;

public interface Images extends Iterable<Image>{

    void addImage(Image image);

    default Extension getExtention(String url) {

//        char[] ex = url.toCharArray();
//        String extension = "";
//
//        for (int i = ex.length - 1; i > 0; i--) {
//
//            if (ex[i] == '.') {
//                break;
//            }
//            extension = ex[i] + extension;
//        }
//
//        return extension;

        return new Extension(url);
    }
}
