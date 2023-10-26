package basic;

import java.util.Scanner;

public class MathClass {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Max value: :" + Math.max(a,b));
		System.out.println("Min value: :" + Math.min(a, b));
		System.out.println("Square root: :"+ Math.sqrt(a));
		System.out.println("Random value: "+ Math.random());
		System.out.println("Power of: "+ Math.pow(a, b));
	}
}
