package tiktok;

public class Follower {
    private static int autoId = 0;
    private int id;
    private String followerName;
    private String followerEmail;
    private int numberLike;

    public Follower(String followerName, String followerEmail, int numberLike) {
        this.followerName = followerName;
        this.followerEmail = followerEmail;
        this.numberLike = numberLike;
        this.id = ++autoId;
    }

    @Override
    public String toString() {
        return  id + followerName + '\'' +
                ", Email: "+followerEmail +'\'' +
                ", numberLike: " + numberLike;
    }
}
