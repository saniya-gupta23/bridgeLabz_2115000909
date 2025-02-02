import java.util.*;
public class Circle{
	private double radius;

	public Circle(){
		this(1.0);
	}

	public Circle(double radius){
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	//method for calculating area
	public double calculateArea(){
		return Math.PI * radius * radius ;
	}

	//method to calculate circumference
	public double calculateCircumference(){
		return 2 * Math.PI * radius ;
	}

	@Override
	public String toString(){
		return "Circle{radius=" + radius + ", area =" + calculateArea() + ",circumference="+ calculateCircumference() +"}";
	}	
	

	public static void main(String args[]){
		//for default cons.
		Circle defaultCircle = new Circle();
		//for parameterized cons
		Circle customCircle = new Circle(5.5);

		System.out.println(defaultCircle);
		System.out.println(customCircle);
	}
}
