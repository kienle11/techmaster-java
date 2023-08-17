package techmaster.service;

import techmaster.entities.Book;
import techmaster.entities.BorrowTicket;
import techmaster.entities.Reader;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class TicketImpl {
    public void createTicket(Scanner scanner, List<Reader> readers,List<Book>books,List<BorrowTicket>tickets){
        ReaderImpl rd = new ReaderImpl();
        BookImpl book = new BookImpl();
        System.out.println("Nhập tên độc giả ");
        String name = scanner.nextLine();
        Reader borrower = rd.findReaderByName(name,readers);
            if (borrower==null){
            System.out.println("Không tìm thấy độc giả");}
        System.out.println("Tên cuốn sách bạn muốn mượn ");
        String nameBook = scanner.nextLine();
        Book borrowBook = book.findBookByName(nameBook, books);
            if (borrowBook==null){
            System.out.println("Không tìm thấy cuốn sách"); return;}
        System.out.println("Ngày bạn muốn trả sách");
        String localdate = scanner.nextLine();
        LocalDate returnDate = LocalDate.parse(localdate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        BorrowTicket ticket = new BorrowTicket(borrower,borrowBook,returnDate);
        tickets.add(ticket);
        System.out.println("Tạo phiếu thành công");
    }
public void returnTicket(Scanner scanner, List<BorrowTicket>tickets){
    System.out.println("Nhập id phiếu");
    int idTicket = Integer.parseInt(scanner.nextLine());
    for (BorrowTicket ticket: tickets){
        if (idTicket==ticket.getId()){
            System.out.println("Trả sách thành công");
            break;
        }
        else System.out.println("Không tìm thấy phiếu mượn sách");
        return;
    }
}
}
