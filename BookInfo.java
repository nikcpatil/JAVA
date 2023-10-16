package Lab2;
import java.util.Scanner;

class Book{
	String Book_name;
	float Book_price;
	
	Scanner sc = new Scanner(System.in);
	
    void setBook(){
		System.out.println("Enter the Book name: ");
		Book_name = sc.nextLine();//String Book_name = ... then it will be a local variable and there will be a ambiguity(NOT Clearearnce)
		
		System.out.println("Enter the Book price: ");
		Book_price = sc.nextFloat();
	}
    void getBook() {
    	System.out.println("The Book title is: "+ Book_name);//and this book_name, Book_price variable won't take the input.
    	System.out.println("The price of book id: "+ Book_price);
    }
    
    public void Create_Book() {
    	
    }
    public void Show_book() {
    	
    }
}
public class BookInfo {

	public static void main(String[] args) {
		Book B1 = new Book();
		
		B1.setBook();
		B1.getBook();
	}
}
