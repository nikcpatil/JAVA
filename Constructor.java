package Lab3;

class person{
	int id;
	String name;
	float Salary;
	
	public person(){
		System.out.println("Default Constructor: ");
		this.id = 101;
		this.name = "Nikita";
		this.Salary = 34567.89f;
	}
	public person(int id, String name, float Salary) {
		System.out.println("Parameterized Constructor");
		this.id=id;
		this.name=name;
		this.Salary= Salary;
	}
	public void show() {
		System.out.println("Id: "+ id + "\tname: "+ name + "\tSalary: "+ Salary);
	}
	//OR
	public void display() {
		System.out.println("Id: "+ id + "\tname: "+ name + "\tSalary: "+ Salary);
	}
}
public class Constructor {
	public static void main(String args[]) {
		person p1 = new person();//Default constructor
		p1.show();
		//OR
		p1.display();
		person p2 = new person(102, "Astha", 234.5f);
		p2.show();
	}

}
