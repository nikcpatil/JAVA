package Lab2;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		System.out.println("Enter the number: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int t1=0, t2=1, t3=0;
		System.out.println("Fibonacci Series: ");
		System.out.print(t2+"\t"); 
		for(int i=1; i<number; i++) {
			t3 = t2+t1;
			System.out.print(t3+"\t");
		    t1=t2;
			t2=t3;
		}
	}
}
