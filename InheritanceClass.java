package lab5;
import java.util.Scanner;
class EmployeeClass{
	Scanner sc = new Scanner(System.in);
	int Empid;
	String Empname;
	int Salary;
	EmployeeClass(int Empid, String Empname){
		this.Empid = Empid;
		this.Empname = Empname;
	}
}
class Manager extends EmployeeClass{
	int fixedSalary;
	int incentives;
	Manager(int Empid, String Empname, int fixedSalary, int incentives){
		super(Empid, Empname);
		this.fixedSalary= fixedSalary;
		this.incentives = incentives;
		
	}
	public void ComputeSalary(){
		System.out.println("Enter Manager id: ");
		Empid = sc.nextInt();
		System.out.println("Enter Manager Name: ");
		Empname = sc.next();
		System.out.println("Enter fixedSalary: ");
		fixedSalary = sc.nextInt();
		System.out.println("Enter incentives: ");
		incentives = sc.nextInt();
		Salary = fixedSalary + incentives;
		System.out.println("The Salary of manager is: "+ Salary);
	}
}
public class InheritanceClass {
	public static void main(String args[]) {
		Manager M1 = new Manager(10, "Nikita", 34000, 6000);
		M1.ComputeSalary();
	}
}
