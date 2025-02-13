
package Level1;

public class Book {
    private String title;
    private String author;
    private double price;
    // default constructor
    Book() {
        this.title = "";
        this.author = "";
        this.price = 0;
    }
    // parematrized constructor
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println(b1.getPrice());

        Book b2 = new Book("abc", "ritick", 200);
        System.out.println(b2.price);
    }

}