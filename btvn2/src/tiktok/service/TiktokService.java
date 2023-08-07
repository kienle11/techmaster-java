package tiktok.service;

import tiktok.Follower;
import tiktok.Idol;
import tiktok.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class TiktokService {
    public Idol createIdol (Scanner scanner){
        System.out.println("Nhập tên idol: ");
        String name = scanner.nextLine();
        System.out.println("Nhập email idol: ");
        String email = scanner.nextLine();
        System.out.println("Nhập tên group: ");
        String group = scanner.nextLine();
        System.out.println("Số lượng người theo dõi: ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Follower> followers = new ArrayList<>();
        for (int i=0; i<n;i++){
            TiktokService service = new TiktokService();
            Follower follower= service.createFlwer(scanner);
            followers.add(follower);
        }
        return new Idol(name, followers,group,email);
    }
    public Follower createFlwer(Scanner scanner){
        System.out.println("Nhập tên người theo dõi:");
        String nameFollow = scanner.nextLine();
        System.out.println("Nhập email:");
        String emailFollow = scanner.nextLine();
        System.out.println("Số lượt like:");
        int numberLike = Integer.parseInt(scanner.nextLine());
        return new Follower(nameFollow,emailFollow,numberLike);
    }
    public Song createSong(Scanner scanner){
        System.out.println("Nhập tên bài hát:");
        String nameSong = scanner.nextLine();
        System.out.println("Nhập tên ca sĩ: ");
        String singer = scanner.nextLine();
        return new Song(singer,nameSong);
    }
}
