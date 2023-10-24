package basic;

class Student{
	int sid;
	String name;
	static String sch_name = "Rajarshi School"; //static variable
}

public class StaticVariableDemo {
	public static void main(String args[]) {
		
		Student s1 = new Student();
		s1.sid = 1;
		s1.name = "Nikita";
		//s1.sch_name = "Rajarshi School";
		System.out.println("Id:"+ s1.sid + "   "+ "Name:"+ s1.name + "   "+ "School Name:"+ Student.sch_name);	
		
		Student s2 = new Student();
		s2.sid = 2;
		s2.name = "Ankita";
		//s2.sch_name = "Rajarshi School";
		System.out.println("Id:"+ s2.sid + "   " + "Name:"+ s2.name + "   "+ "School Name:"+ Student.sch_name);	
	}
}
