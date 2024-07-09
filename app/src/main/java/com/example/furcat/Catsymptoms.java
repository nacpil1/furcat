package com.example.furcat;

public class Catsymptoms {
    private String catName;
    private String description;

    public Catsymptoms(String catName, String description) {
        this.catName = catName;
        this.description = description;
    }

    public String getCatName() {
        return catName;
    }

    public String getDescription() {
        return description;
    }
}

