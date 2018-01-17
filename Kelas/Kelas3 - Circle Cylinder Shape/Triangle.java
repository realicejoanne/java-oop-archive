//Triangle class, subclass of Shape

public class Triangle extends Shape {
	//private member variables
	private int base;
	private int height;
	
	//constructor
	public Triangle(String color, int base, int height){
		super(color);
		this.base = base;
		this.height = height;
	}
	
	@Override
	public String toString(){
		return "Triangle [ base = "+base+", height = "+height+", "+super.toString()+ "]";
	}
	
	//override the inherited getArea(0 to provide the proper implementation
	@Override
	public double getArea(){
		return 0.5*base*height;
	}
}