package basic;
//static method
class Circle{
	public static float areaOfCircle(int r){
		return (3.14f*r*r);
	}
}
public class StaticMethod {
	public static void main(String args[]) {
		Circle c1 = new Circle();
//		float a = c1.areaOfCircle(3);
//		System.out.println("Area: "+ a);
		System.out.println("Area of circle: "+ Circle.areaOfCircle(6));
	}
}
