//The superclass Circle
public class Circle {
	//private instance variable
	private double radius;
	//constructor
	public Circle (double radius){
		this.radius = radius;
	}
	//getter
	public double getRadius(){
		return this.radius;
	}
	//return the area of this circle
	public double getArea(){
		return radius*radius*Math.PI;
	}
	//describe itself
	public String toString(){
		return "Circle [ radius = "+radius+" ]";
	}
}