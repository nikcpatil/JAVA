package Lab2;

import java.util.Scanner;
public class Armstrong {
	public static void main(String args[]) {
		System.out.print("Enter the number: ");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int rem, digit=0;
			double Result=0; 
			int temp = n;
			while(temp>0) {
				temp = temp/10;
				digit++;
			}
			System.out.println(digit);
			temp = n;
			while(temp>0) {
			rem = temp%10;
			Result = Result + (Math.pow(rem, digit));
			temp = temp/10;
			}
			if(Result==n) {
				System.out.println(n + " is a armstrong number.");
			}
			else {
				System.out.println(n + " is not a armstrong number.");
			}
	}

}
