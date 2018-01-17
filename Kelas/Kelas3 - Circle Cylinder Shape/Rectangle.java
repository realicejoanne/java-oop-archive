//Rectangle class, subclass of Shape

public class Rectangle extends Shape {
	//private member variables
	private int length;
	private int width;
	
	//constructor
	public Rectangle(String color, int length, int width){
		super(color);
		this.length = length;
		this.width = width;
	}
	
	@Override
	public String toString(){
		return "Rectangle [ length = "+length+", width = "+width+", "+super.toString()+ "]";
	}
	
	//override the inherited getArea(0 to provide the proper implementation
	@Override
	public double getArea(){
		return length*width;
	}
}