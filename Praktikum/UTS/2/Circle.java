public class Circle {
	private double radius;
	private String color;
   
	public Circle() {
		radius = 1.0;
	}
   
	public Circle(double radius){
		this.radius = radius;
	}
   
	public double getPerimeter(){
		return radius*2*Math.PI; 
	}
   
	public double getArea(){
		return radius*radius*Math.PI;
	}
}