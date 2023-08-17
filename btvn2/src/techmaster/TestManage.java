package techmaster;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;
import techmaster.service.BookImpl;
import techmaster.service.ReaderImpl;
import techmaster.service.TicketImpl;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReaderImpl reader = new ReaderImpl();
        List<Reader> readers = new ArrayList<>();
        BookImpl book = new BookImpl();
        List<Book> books = new ArrayList<>();
        TicketImpl ticket = new TicketImpl();
        List<BorrowTicket> borrowTickets = new ArrayList<>();
        System.out.println("Chương trình quản lý sách Techmaster");
        System.out.println("1. Quản lý sách");
        System.out.println("2. Quản lý độc giả");
        System.out.println("3. Quản lý mượn trả sách");
        System.out.println("4. Thoát chương trình");
        System.out.println("Bạn có thể thực hiện các chức năng trên. Mời chọn");
        int answer = Integer.parseInt(scanner.nextLine());
        switch (answer){
            case 1:
                reader.manageReaderSelect(scanner,readers); break;
            case 2:
                book.manageBookSelect(scanner,books); break;
            case 3:
                ticket.menuTicket(scanner,readers,books,borrowTickets);break;
            default:
                System.out.println("Lựa chọn không hợp lệ");break;
        } if (answer==4) return;
    }
}
