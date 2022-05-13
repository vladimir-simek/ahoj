package org.vladimirsimek.kodytek;

public class Song {
    //id;year;position;artist;song;indicativeRevenue;us;uk;de;fr;ca;au"

    int id;
    int year;
    int position;
    String artist;
    String song;

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public int getPosition() {
        return position;
    }

    public String getArtist() {
        return artist;
    }

    public String getSong() {
        return song;
    }

    public Song(String id, String year, String position, String artist, String song) {
        this.id = makeInt(id);
        this.year = makeInt(year);
        this.position = makeInt(position);
        this.artist = makeString(artist);
        this.song = makeString(song);
    }

    public String makeString(String input){
        input = input.substring(1, input.length() - 1);
        return input;
    }

    public int makeInt(String input){
        input = input.substring(1, input.length() - 1);
        return Integer.parseInt(input);
    }
}
