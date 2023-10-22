package basic;

public class WrapperClass {
	public static void main(String args[]) {
		System.out.println("args[0]: "+ args[0]);
		System.out.println("args[1]: "+ args[1]);
		String s1 = args[0];
		String s2 = args[1];
		
		System.out.println("Result of (s1+s2): "+ (s1+s2));
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println("Result of (a+b): "+ (a+b));
	}
}
