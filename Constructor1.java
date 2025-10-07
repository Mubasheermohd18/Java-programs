
import java.util.Scanner;
class Book {
    String title;
    double price;
    Book(String title, double price) {
        this.title = title;
        this.price = price;
    }
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

public class Constructor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String t = sc.nextLine();
        System.out.print("Enter book price: ");
        double p = sc.nextDouble();
        Book b = new Book(t, p);
        b.display();
        sc.close();
    }
}
