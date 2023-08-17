package techmaster;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;
import techmaster.service.BookImpl;
import techmaster.service.ReaderImpl;
import techmaster.service.TicketImpl;
import techmaster.view.Menu;

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
        int answer =0;
        menu.doSelectMenu(scanner,answer,reader,readers,book,books,ticket,borrowTickets);
    }
}