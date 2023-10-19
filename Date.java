package lab4;

public class Date {
	int dd;
	int mm;
	int yy;
	
	Date(){
		System.out.println("Default Constructor");
		this.dd = 23;
		this.mm = 03;
		this.yy = 2002;
	}
	Date(int dd, int mm, int yy){
		System.out.println("Parameterised Constructor");
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString() {
		return dd+"/"+mm+"/"+yy;
	}
    public static void main(String args[]) {
    	Date D = new Date();
    	System.out.println(D);
    	Date D1 = new Date(23, 04, 2003);
    	System.out.println(D1);
    	
    }
}
