package com.example.furcat;

class CatModel {
    String catName;
    String description;
    int image;

    public CatModel(String catName, int image, String description) {
        this.catName = catName;
        this.image = image;
        this.description = description;
    }

    public String getCatName() {
        return catName;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }
}
