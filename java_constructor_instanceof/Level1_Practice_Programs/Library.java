package Level1;

public class Library {

    private String title;
    private String author;
    private double price;
    private boolean availability;

    Library(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        availability = true;
    }

    void borrowBook(){
        if(availability){
            availability = false;
            System.out.println("you borrow a book " + this.title);
        }else{
            System.out.println(this.title + " is not available");
        }
    }

  

    public static void main(String[] args) {
        Library l1 = new Library("Abc", "raj", 300);
        l1.borrowBook();
        l1.borrowBook();
    }
}
