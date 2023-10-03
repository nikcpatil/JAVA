package Lab1;

public class ArithmeticOperation {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("args[0]: " + args[0]);
		System.out.println("args[1]: " + args[1]);
		String s1= args[0];
		String s2= args[1];
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		
        System.out.println("Addition is: "+(a+b));
        System.out.println("Subtraction is: "+(a-b));
        System.out.println("Multiplication is: "+(a*b));
        System.out.println("Division is: "+(a/b));
        System.out.println("Remainder is: "+(a%b));
        
	}

}