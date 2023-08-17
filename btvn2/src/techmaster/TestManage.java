package techmaster;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;
import techmaster.service.BookImpl;
import techmaster.service.ReaderImpl;
import techmaster.service.TicketImpl;
import techmaster.view.Menu;

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
        Menu menu = new Menu();
        menu.menu();
        do {
            int answer = Integer.parseInt(scanner.nextLine());
            switch (answer) {
                case 1 -> reader.manageReaderSelect(scanner, readers);
                case 2 -> book.manageBookSelect(scanner, books);
                case 3 -> ticket.menuTicket(scanner, readers, books, borrowTickets);
                default -> System.out.println("Lựa chọn không hợp lệ");
            }
            if (answer==4)break;
        } while (true);
    }
}