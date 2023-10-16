package Lab2;

import java.util.Scanner;

public class LearORNot {
	public static void main(String args[]) {
		System.out.println("Enter the year: ");
		Scanner sc = new Scanner(System.in);
		
		int Year = sc.nextInt();
	    boolean leap = false;

	    // if the year is divided by 4
	    if (Year % 4 == 0) {

	      // if the year is century
	      if (Year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (Year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(Year + " is a leap year.");
	    else
	      System.out.println(Year + " is not a leap year.");
		
	}
}
