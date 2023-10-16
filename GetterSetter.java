package Lab2;
class Employee{
	int empid;
	String name;
	float salary;
	
	public void setempid(int empid) {
		this.empid = empid;
	}
	public int getempid() {
		return empid;
	}
	public void setname(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	public void setsalary(float salary) {
		this.salary= salary;
	}
	public float getsalary(){
		return salary;
	}
}
public class GetterSetter {
	public static void main(String args[]) {
		Employee E1=  new Employee();
		E1.setempid(101);
		E1.setname("Nikita");
	    E1.setsalary(1000000);
	    
	    System.out.println("Employee id: "+ E1.getempid());
	    System.out.println("Employee name is: "+ E1.getname());
	    System.out.println("Employee Salary is: "+ E1.getsalary());
	    
	}
}
