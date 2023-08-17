package techmaster.entities;

public class Book {
    private static int autoId;
    private int id;
    private String name;
    private String title;
    private String author;
    private int quantity;

    public Book(String name, String title, String author, int quantity) {
        this.name = name;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
        this.id = ++autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book: "+id +
                ", name: " + name + '\'' +
                ", title: " + title + '\'' +
                ", author: " + author + '\'' +
                ", quantity: " + quantity;
    }
}
