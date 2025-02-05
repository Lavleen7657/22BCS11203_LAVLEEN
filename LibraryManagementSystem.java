import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: " + getPrice());
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Book 1:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type1 = sc.nextLine();
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Price: ");
        double price1 = sc.nextDouble();
        sc.nextLine(); 

        if (type1.equalsIgnoreCase("Fiction")) {
            Fiction fictionBook = new Fiction(title1, author1, price1);
            fictionBook.displayDetails();
        } else if (type1.equalsIgnoreCase("Non-Fiction")) {
            NonFiction nonFictionBook = new NonFiction(title1, author1, price1);
            nonFictionBook.displayDetails();
        }

        System.out.println("\nBook 2:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type2 = sc.nextLine();
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine();

        if (type2.equalsIgnoreCase("Fiction")) {
            Fiction fictionBook = new Fiction(title2, author2, price2);
            fictionBook.displayDetails();
        } else if (type2.equalsIgnoreCase("Non-Fiction")) {
            NonFiction nonFictionBook = new NonFiction(title2, author2, price2);
            nonFictionBook.displayDetails();
        }
        sc.close();
    }
}

