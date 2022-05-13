package org.vladimirsimek.kodytek;

public class User {
    private String samuel;
    private String kodytek;

    public User(String samuel, String kodytek) {
        this.samuel = samuel;
        this.kodytek = kodytek;
    }

    public String getKodytek() {
        return kodytek;
    }

    public void setKodytek(String kodytek) {
        this.kodytek = kodytek;
    }

    public String getSamuel() {
        return samuel;
    }

    public void setSamuel(String samuel) {
        this.samuel = samuel;
    }

}
