package techmaster.view;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;
import techmaster.service.BookImpl;
import techmaster.service.ReaderImpl;
import techmaster.service.TicketImpl;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public void menu(){
        System.out.println("Chương trình quản lý sách Techmaster");
        System.out.println("1. Quản lý sách");
        System.out.println("2. Quản lý độc giả");
        System.out.println("3. Quản lý mượn trả sách");
        System.out.println("4. Thoát chương trình");
        System.out.println("Bạn có thể thực hiện các chức năng trên. Mời chọn");
    }
    public void doSelectMenu(Scanner scanner, int answer, ReaderImpl reader, List<Reader> readers,
     BookImpl book, List<Book>books, TicketImpl ticket, List<BorrowTicket>borrowTickets){
        do {menu();
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
