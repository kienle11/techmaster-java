package tiktok;

import tiktok.service.TiktokService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestTiktok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========TIKTOK=======");
        System.out.println("Nhập số lượng idols:");
        int idolsNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<Idol> idols = new ArrayList<>();
        TiktokService service = new TiktokService();
        for (int i=0; i<idolsNumber;i++){
            System.out.println("Nhập idol "+(i+1));
            Idol idol= service.createIdol(scanner);
            idols.add(idol);
        }
        System.out.println("Nhập số lượng bài hát:");
        int songNumber = Integer.parseInt(scanner.nextLine());
        ArrayList<Song> songs = new ArrayList<>();
        for (int i=0; i<songNumber; i++){
            System.out.println("Nhập thông tin bài hát thứ "+(i+1));
            Song song= service.createSong(scanner);
            songs.add(song);
        }
        Tiktok tiktok = new Tiktok(idols,songs);
        System.out.println(tiktok);
    }
}
