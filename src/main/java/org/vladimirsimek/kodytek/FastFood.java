package org.vladimirsimek.kodytek;

public class FastFood {
    public String imageURL;
    public String menuURL;
    public String place;

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getMenuURL() {
        return menuURL;
    }

    public void setMenuURL(String menuURL) {
        this.menuURL = menuURL;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public FastFood(String place, String imageURL, String menuURL) {
        this.imageURL = imageURL;
        this.menuURL = menuURL;
        this.place = place;
    }
}
