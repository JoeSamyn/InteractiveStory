package com.samyn.joseph.interactivestory.model;

public class Choice {
    private int imageId;
    private int nextPage;

    public Choice(int imageId, int nextPage) {
        this.imageId = imageId;
        this.nextPage = nextPage;
    }

    public int getImageId() {

        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
