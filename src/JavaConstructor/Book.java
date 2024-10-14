package JavaConstructor;
//constructor overloading

public class Book {
	private String title;
	private String author;
	private double price;
	
	
	public Book() {
		this.title = "Unknown";
		this.author = "Unknown";
		this.price = 0.0;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 0.0;
	}
	
	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("Book1 Title: " + b1.title);
        System.out.println("Book1 Author: " + b1.author);
        System.out.println("Book1 Price: " + b1.price);
        
		Book b2 = new Book("Amatka", "Karin Tidbeck");
		System.out.println("Book1 Title: " + b2.title);
        System.out.println("Book1 Author: " + b2.author);
        System.out.println("Book1 Price: " + b2.price);
        
		Book b3 = new Book("Altered Carbon", "Richard K. Morgan", 18.99);
		System.out.println("Book1 Title: " + b3.title);
        System.out.println("Book1 Author: " + b3.author);
        System.out.println("Book1 Price: " + b3.price);
	}

}
