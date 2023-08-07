package tiktok;

public class Song {
    private static int autoID = 0;
    private int id;
    private String nameSong;
    private String singer;

    public Song(String singer, String nameSong) {
        this.singer = singer;
        this.id = ++autoID;
        this.nameSong = nameSong;
    }

    @Override
    public String toString() {
        return id +
                ", Name: " + nameSong + '\t' +
                ", Singer: " + singer;
    }
}
