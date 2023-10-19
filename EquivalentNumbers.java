package lab4;
/*Accept Integer values from user and display it’s equivalent Binary, Hexadecimal, Octal 
values....Use Integer.parseInt(String input, int radix) to convert from any type of number to an Integer.*/
import java.util.Scanner;
public class EquivalentNumbers {
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num+" in binary form "+ Integer.toBinaryString(num));
		System.out.println(num +" in hexadecimal form "+ Integer.toHexString(num));
		System.out.println(num +" in octal form "+ Integer.toOctalString(num));
		
	}
}
