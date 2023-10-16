package Lab2;

import java.util.Scanner;

public class Voting {
	public static void main(String args[]) {
	
		System.out.println("Enter the age: ");
		Scanner sc = new Scanner(System.in);
		int age= sc.nextInt();
		System.out.println(age);
		if(age>=18) {
			System.out.println("You are eligible for voting");
		}
		else {
			System.out.println("You are not eligible for voting");
		}
	}
}
