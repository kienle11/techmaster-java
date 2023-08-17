package techmaster.entities;

import java.time.LocalDate;

public class BorrowTicket {
    private static int autoID;
    private int id;
    private Reader reader;
    private Book book;
    private LocalDate borrowDate = LocalDate.now();
    private LocalDate returnDate;

    public BorrowTicket(Reader reader, Book book,LocalDate returnDate) {
        this.reader = reader;
        this.book = book;
        this.returnDate = returnDate;
        this.id = ++autoID;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "BorrowTicket" +id +
                ". reader: " + reader +
                ", book: " + book +
                ", borrowDate: " + borrowDate +
                ", returnDate: " + returnDate;
    }
}
