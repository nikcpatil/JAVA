package basic;

public class StringClass {
	public static void main(String args[]) {
		//String s = new String("Hello");--->by new operator
		String s = "Hello";//literal way
		String s1 = "  He ll o";
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s1.length());
		System.out.println(s1.trim());
		System.out.println(s1.trim().length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(3));
		System.out.println(s.indexOf('e'));
		System.out.println(s.concat("Profound"));
		System.out.println(s.isEmpty());
		//compareTo
		String a = "Java";
		String b = "java";
		System.out.println(a.compareTo(b));
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(a));
	}
}
