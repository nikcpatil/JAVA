package Lab3;

import java.util.Scanner;
public class ArrayArithmeticOperation {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter the size of first array: ");
	   int n1 = sc.nextInt();
	   System.out.print("Enter the size of second array: ");
	   int n2 = sc.nextInt();
	   
	   int a1[] = new int [n1];
	   System.out.print("Enter the elements in first array: ");
	   for(int i=0; i<n1; i++) {
		   a1[i] = sc.nextInt();
	   }
	   
	   int a2[] = new int[n2];
	   System.out.print("Enter the elements in second array: ");
	   for(int i=0; i<n2; i++) {
		   a2[i]= sc.nextInt();
	   }
	   
	   System.out.print("The elements in first array are: ");
	   for(int i=0; i<n1; i++) {
		   System.out.print(a1[i]+ " ");
	   }
	   System.out.println();
	   System.out.print("The elemnets in second array are: ");
	   for(int i=0; i<n2; i++) {
		   System.out.print(a2[i]+ " ");
	   }
	   System.out.println();
	   System.out.println("Enter the size of final array: ");
	   int n3 = sc.nextInt();
	   int a3[]= new int[n3];
	   for(int i=0; i<n3; i++) {
		   a3[i]= a1[i]+a2[i];
	   }
	   System.out.println("The addition of final array is: ");
	   for(int i=0; i<n3; i++) {
		   System.out.println(a3[i]+" ");
	   }
	   for(int i=0; i<n3; i++) {
		   a3[i]= a1[i]-a2[i];
	   }
	   System.out.println("The Subtraction of final array is: ");
	   for(int i=0; i<n3; i++) {
		   System.out.println(a3[i]+" ");
	   }
	   
	   for(int i=0; i<n3; i++) {
		   a3[i]= a1[i]*a2[i];
	   }
	   System.out.println("The multiplication of final array is: ");
	   for(int i=0; i<n3; i++) {
		   System.out.println(a3[i]+" ");
	   }
	   
	   
	   for(int i=0; i<n3; i++) {
		   a3[i]= a1[i]/a2[i];
	   }
	   System.out.println("The Division of final array is: ");
	   for(int i=0; i<n3; i++) {
		   System.out.println(a3[i]+" ");
	   }
   }
}
