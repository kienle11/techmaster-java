package tiktok;

import java.util.ArrayList;

public class Tiktok {
    private ArrayList<Idol> idols;
    private ArrayList<Song> songs;

    public Tiktok(ArrayList idols, ArrayList songs) {
        this.idols = idols;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Tiktok" + " Idols: " + idols +
                ", Songs: " + songs;
    }
}
