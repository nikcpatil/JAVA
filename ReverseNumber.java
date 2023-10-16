package Lab2;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String args[]) {
		System.out.print("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int Number= sc.nextInt();
		int rev = 0;
		int rem=0;
		
		while(Number>0) {
			rem= Number%10;
			rev= rev* 10 + rem;
			Number = Number/10;
		}
		System.out.println("Reverse number is: "+ rev);
	}
}
