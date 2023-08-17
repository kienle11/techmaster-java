package techmaster.service;

import techmaster.entities.Book;

import java.util.List;
import java.util.Scanner;

public class BookImpl implements ITools<Book> {

    public void manageBookSelect(Scanner scanner, List<Book> books) {
        do {
            System.out.println("Bạn có thể thực hiện những việc sau");
            System.out.println("Thêm thông tin cuốn sách mới");
            System.out.println("Xóa 1 cuốn sách");
            System.out.println("Sửa thông tin  cuốn sách ");
            System.out.println("Hiển thị thông tin sách");
            System.out.println("Thoát");
            System.out.println("Mời bạn chọn");
            int choose = 0;
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1 -> add(books, scanner);
                    case 2 -> delete(books, scanner);
                    case 3 -> edit(scanner, books);
                    case 4 -> display(books, scanner);
                    default -> System.out.println("Lựa chọn không hợp lệ ");
                }
            } catch (Exception ignored) {
            }
            if (choose == 5) break;
        } while (true);
    }

    @Override
    public void add(List<Book> books, Scanner scanner) {
        System.out.println("Nhập thông tin cuốn sách");
        System.out.println("Tên cuốn sách");
        String nameBook = scanner.nextLine();
        System.out.println("Chủ đề cuốn sách");
        String title = scanner.nextLine();
        System.out.println("Tác giả cuốn sách");
        String author = scanner.nextLine();
        System.out.println("Số lượng");
        int quantity = Integer.parseInt(scanner.nextLine());
        books.add(new Book(nameBook, title, author, quantity));
    }

    @Override
    public void delete(List<Book> books, Scanner scanner) {
        System.out.println("Nhập id cuốn sách");
        int getID = Integer.parseInt(scanner.nextLine());
        for (Book bookID : books) {
            if (getID == bookID.getId()) {
                books.remove(bookID);
                System.out.println("Đã xóa thành công");
            } else {
                System.out.println("Không tìm thấy sách");
                System.out.println("Thử tìm theo tên sách:");
                String nameBook = scanner.nextLine();
                if (nameBook.equalsIgnoreCase(bookID.getName())) {
                    books.remove(nameBook);
                    System.out.println("Đã xóa thành công");
                } else System.out.println("Không tìm thấy cuốn sách");
            }
        }
    }

    @Override
    public void edit(Scanner scanner, List<Book> books) {
        System.out.println("Nhập id cuốn sách");
        int getID = Integer.parseInt(scanner.nextLine());
        for (Book bookID : books) {
            if (getID == bookID.getId()) {
                System.out.println("Nhập tên mới của cuốn sách");
                String nameUpdate = scanner.nextLine();
                System.out.println("Chủ đề mới của cuốn sách");
                String titleUpdate = scanner.nextLine();
                System.out.println("Tác giả");
                String authorUpdate = scanner.nextLine();
                System.out.println("Số lượng mới");
                int quantityUpdate = Integer.parseInt(scanner.nextLine());
                bookID.setName(nameUpdate);
                bookID.setAuthor(authorUpdate);
                bookID.setTitle(titleUpdate);
                bookID.setQuantity(quantityUpdate);
                System.out.println("Cập nhật thành công");
            } else {
                System.out.println("Không tìm thấy sách");
                System.out.println("Thử tìm theo tên sách:");
                String nameBook = scanner.nextLine();
                if (nameBook.equalsIgnoreCase(bookID.getName())) {
                    System.out.println("Nhập tên mới của cuốn sách");
                    String nameUpdate = scanner.nextLine();
                    System.out.println("Chủ đề mới của cuốn sách");
                    String titleUpdate = scanner.nextLine();
                    System.out.println("Tác giả");
                    String authorUpdate = scanner.nextLine();
                    System.out.println("Số lượng mới");
                    int quantityUpdate = Integer.parseInt(scanner.nextLine());
                    bookID.setName(nameUpdate);
                    bookID.setAuthor(authorUpdate);
                    bookID.setTitle(titleUpdate);
                    bookID.setQuantity(quantityUpdate);
                    System.out.println("Cập nhật thành công");
                } else System.out.println("Không tìm thấy cuốn sách");
            }
        }
    }

    @Override
    public void display(List<Book> books, Scanner scanner) {
        System.out.println("Tìm kiếm thông tin sách:");
        System.out.println("1. Theo ID");
        System.out.println("2. Theo tên");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Mời nhập id cuốn sách ");
                int idBook = Integer.parseInt(scanner.nextLine());
                for (Book bookID : books) {
                    if (idBook == bookID.getId()) {
                        System.out.println(bookID);
                    } else System.out.println("Không tìm thấy cuốn sách trùng với ID");
                }
            }
            case 2 -> {
                System.out.println("Nhập tên cuốn sách bạn muốn tìm");
                String bookName = scanner.nextLine();
                for (Book nameBook : books) {
                    if (bookName.equalsIgnoreCase(nameBook.getName())) {
                        System.out.println(nameBook);
                    } else System.out.println("Không tìm thấy cuốn sách");
                }
            }
        }
    }

    public Book findBookByName(String name, List<Book> books) {
        for (Book book : books) {
            if (name.equals(book.getName())) {
            return book;}}
            return null;}
}


