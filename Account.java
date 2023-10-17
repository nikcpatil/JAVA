package Lab3;
import java.util.Scanner;
public class Account {
	Scanner ob=new Scanner(System.in); 
	int acc; 
	String n; 
	String t; 
	int amt; 
	Account() { 
		System.out.println(" your details is "); 
	} 
	Account(int acc,String n,String t,int amt) { 
		//this(); 
		this.acc=acc; 
		this.n=n; 
		this.t=t; 
		this.amt=amt; 
		} 
	void display() { 
		System.out.println(acc+","+n+","+t+","+amt); 
	} 
	void deposite() { 
		int dep; 
		System.out.println("enter amount"); 
		dep = ob.nextInt(); amt=amt+dep; 
		System.out.println("Current balance : "+amt); } 
	void withdraw() { 
		int wi; 
		System.out.println("enter amount"); 
		wi = ob.nextInt(); 
		if(amt>=wi) { 
			amt=amt-wi; 
			System.out.println("Current balance : " +amt); 
		} 
		else { 
			System.out.println("Your balance is not sufficient"); 
		} 
	} 
	public String toString() {
        return acc+" "+n+" "+t+" "+amt; 
    } 
	public static void main(String []args) { 
		int ch; 
		Scanner ob=new Scanner(System.in); 
		System.out.println("enter acc no"); 
		int acc=ob.nextInt(); 
		System.out.println("enter name"); 
		String n=ob.next(); 
		System.out.println("enter type"); 
		String t=ob.next(); 
		System.out.println("enter amt"); 
		int amt=ob.nextInt(); 
		Account a1=new Account(acc,n,t,amt); 
		System.out.println(a1); 
		do { 
			System.out.println("Main Menu\n1.Display All\n2.Deposit\n3.Withdrawal\n4.Exit"); 
			System.out.println("Ur Choice :"); 
			ch=ob.nextInt(); 
			switch(ch) { 
			case 1: a1.display(); 
			        break; 
			case 2: a1.deposite(); 
			        break; 
			case 3: a1.withdraw(); 
			        break; 
			case 4: System.out.println("Bye....!!!!!!"); 
			        break; 
			} 
		}while(ch!=4); 
	} 
}

