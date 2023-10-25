package lab5;

import java.util.Scanner;

class Employee{
	int Empid;
	String name;
	float Salary;
	Scanner sc = new Scanner(System.in);
	public Employee(int Empid, String name) {
		this.Empid = Empid;
		this.name = name;
	}
	public void display() {
		System.out.println("Enter Employee id: ");
		Empid = sc.nextInt();
		System.out.println("Enter name: ");
		name = sc.next();
		
		System.out.println("Employee id:"+ Empid + "  "+ "Name:"+ name + "  "+ "Salary:"+ Salary);
	}
}
class WageEmployee extends Employee{
	int hrs;
	int rate;
	WageEmployee(int Empid, String name, int hrs, int rate){
		super(Empid, name);
		this.hrs = hrs;
		this.rate = rate;
	}
	public void ComputeSalary() {
		Salary = hrs*rate;
		System.out.println("Enter hrs: ");
		hrs = sc.nextInt();
		System.out.println("Enter rate: ");
		rate = sc.nextInt();
	}
}
class SalesPerson extends WageEmployee{
	int sales;
	int commision;
	SalesPerson(int Empid, String name, int hrs, int rate, int sales, int commision){
		super(Empid, name, hrs, rate);
		this.commision = commision;
		this.sales = sales;
	}
	public void ComputeSalary() {
		System.out.println("Enter the sales: ");
		sales = sc.nextInt();
		System.out.println("Enter the commision: ");
		commision = sc.nextInt();
		Salary = sales + commision;
	}
}
public class Inheritance {
	public static void main(String args[]) {
		SalesPerson sp = new SalesPerson(11, "nik", 1, 23, 12, 45);
		sp.ComputeSalary();
		sp.display();
	}
}
