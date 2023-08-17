package techmaster.entities;

import java.time.LocalDate;

public class BorrowTicket {
    private Reader reader;
    private Book book;
    private LocalDate borrowDate = LocalDate.now();
    private LocalDate returnDate;

    public BorrowTicket(Reader reader, Book book,LocalDate returnDate) {
        this.reader = reader;
        this.book = book;
        this.returnDate = returnDate;
    }

}
