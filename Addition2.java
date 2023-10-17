package Lab3;


public class Addition2 {
	
	public int add(int a, int b) {
		  return (a+b);
	  }
	public int add(int a, int b, int c) {
		return (a+b+c);
	}
	//for intergers
	public int add(int ...a) {
		int sum=0;
		for(int x: a) {
			sum = sum+x;
		}
		return sum;
	}
	//for string
	public void show(int n, String ...s) {
		System.out.println("n : "+n);
		for(String str: s) {
			System.out.println(str+ "  ");
		}
	}
	
    public static void main(String args[]) {
    	  Addition2 first = new Addition2();
    	  System.out.println(first.add(2, 7));
    	  System.out.println(first.add(2, 7, 3));
    	  System.out.println(first.add(2, 7, 4 , 2, 8, 6, 4));
      }
      first.show(1, "Addition");
      first.show(2, "Profound", "JAVA");

}
