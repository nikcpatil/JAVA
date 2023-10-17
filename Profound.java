package Lab3;

public class Profound {
    
	String str;
	private static Profound p= null;
	
    private Profound() {
    	System.out.println("It is a private constructor");
    	str = "Hello";
    }
    
    public static Profound Profound() {
    	if(p==null) {
    		p = new Profound();
    	}
    	return p;
    }
    public static Profound getInstance() {
    	if(p==null) {
    		p = new Profound();
    	}
    	return p;
    }
}
