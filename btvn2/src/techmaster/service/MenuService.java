package techmaster.service;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;
import techmaster.view.Menu;

import java.util.List;
import java.util.Scanner;

public class MenuService {
    public void doSelectMenu(Menu menu, Scanner scanner, int answer, ReaderImpl reader, List<Reader>readers,
    BookImpl book, List<Book>books, TicketImpl ticket, List<BorrowTicket>borrowTickets){
        do {menu.menu();
            try{
                answer = Integer.parseInt(scanner.nextLine());
                switch (answer) {
                    case 1 -> reader.manageReaderSelect(scanner, readers);
                    case 2 -> book.manageBookSelect(scanner, books);
                    case 3 -> ticket.menuTicket(scanner, readers, books, borrowTickets);
                    case 4 -> {}
                    default -> System.out.println("Lựa chọn không hợp lệ");
                }}catch (Exception e){
                System.out.println("Mời chọn lại");
            }
        } while (answer!=4);
    }
}
