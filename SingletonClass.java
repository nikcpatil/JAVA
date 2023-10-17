package Lab3;

public class SingletonClass {
      public static void main(String args[]) {
    	  // In singleton class we can't create more than one object ---> Profound p1 = new Profound(); //error beacuse of private constructor
    	  
    	  Profound P1 = Profound.getInstance();
    	  System.out.println(P1.str);
    	  
    	  Profound P2 = Profound.Profound();
    	  System.out.println(P2.str);
      
    	  if(P1.str == P2.str) {
    		  System.out.println("Equal");
    	  }
    	  else {
    		  System.out.println("Not equal");
    	  }
    	  
      }
}
