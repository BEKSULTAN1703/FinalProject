package model;

public class BookProduct extends Product {
    private String author;
    private int pageCount;

    public BookProduct(String id, String name, double price, String author, int pageCount) {
        super(id, name, price);
        this.author = author;
        this.pageCount = pageCount;
    }
    public String bookSummary() {
        return "Book by " + author + " with " + pageCount + " pages.";
    }

}
