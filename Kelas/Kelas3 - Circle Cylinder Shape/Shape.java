//Superclass Shape maintain the common properties of all shapes

public class Shape {
	//private member variable
	private String color;
	
	//constructor
	public Shape (String color){
		this.color = color;
	}
	
	@Override
	public String toString(){
		return "color = "+color+" ";
	}
	
	//all shapes must have a method called getArea()
	public double getArea(){
		//We have a problem here! We need to return some value to compile the program.
		System.err.println("Shape unknown! Cannot compute area!");
		return 0;
	}
}