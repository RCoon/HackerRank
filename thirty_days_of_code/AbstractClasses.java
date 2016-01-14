package thirty_days_of_code;

import java.util.Scanner;

/*
 * Problem Statement:
 * An abstract class is a class that cannot be instantiated, meaning you cannot
 * create a new instance of it. Attempting to instantiate an abstract class
 * (such as abstract class Book, provided for you in the editor) like so:
 * 
 * Book new_novel=new Book("The Alchemist","Paulo Coelho");
 * results in error: Book is abstract; cannot be instantiated. This type of
 * class is only meant to serve as a base or blueprint for connecting the
 * subclasses that inherit it.
 * 
 * To use an abstract class, you must create its subclass and then instantiate
 * the subclass. Any abstract methods declared in the abstract class (such as
 * abstract void display() in abstract class Book) must be implemented by the
 * subclass.
 * 
 * In the editor we have provided the abstract Book class and a Solution class.
 * In the Solution class we created instance of a class called MyBook. Your task
 * is to write just the MyBook class. The class MyBook mustn't be public.
 * 
 * Input Format: 
 * Input from STDIN is already handled in the code given in the editor. MyBook's
 * constructor must have the following parameters: String title, String author,
 * and int price.
 * 
 * Output Format: 
 * The void display() method should print and label the respective title,
 * author, and price of the book's instance (with each value on its own line)
 * like so:
 * 
 * Title: $title
 * Author: $author
 * Price: $price
 * Note: The $ is prepended to variable names to indicate they are placeholders
 * for variables.
 * 
 * Sample Input: 
 * The Alchemist
 * Paulo Coelho
 * 248
 * 
 * Sample Output: 
 * Title: The Alchemist
 * Author: Paulo Coelho
 * Price: 248
 */
public class AbstractClasses {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		String author = sc.nextLine();
		int price = sc.nextInt();
		Book new_novel = new MyBook(title, author, price);
		new_novel.display();
		sc.close();
	}
}

class MyBook extends Book {
    
    private int price;
    
    public MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }
    
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

abstract class Book {
	String title;
	String author;

	Book(String t, String a) {
		title = t;
		author = a;
	}

	abstract void display();
}