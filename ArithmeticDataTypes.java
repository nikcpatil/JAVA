package Lab1;

public class ArithmeticDataTypes {
	public static void main(String args[]) {
			System.out.println("args[0]: " + args[0]);
			System.out.println("args[1]: " + args[1]);
			String s1= args[0];
			String s2= args[1];
			float a = Float.parseFloat(s1);
			double b = Double.parseDouble(s2);
			
	        System.out.println("Addition is: "+(a+b));
	        System.out.println("Subtraction is: "+(a-b));
	        System.out.println("Multiplication is: "+(a*b));
	        System.out.println("Division is: "+(a/b));
	        System.out.println("Remainder is: "+(a%b));
	        
		}

	}


