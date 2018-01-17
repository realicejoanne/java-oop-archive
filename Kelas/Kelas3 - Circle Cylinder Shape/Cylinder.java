//The subclass Cylinder
public class Cylinder extends Circle {
	//private instance variable
	private double height;
	//constructor
	public Cylinder(double height, double radius){
		super(radius);
		this.height = height;
	}
	//getter
	public double getHeight(){
		return this.height;
	}
	//return the volume of this cylinder
	public double getVolume(){
		return super.getArea()*height;
	}
	//override the inherited method to return the surface area
	@Override
	public double getArea(){
		return 2.0*Math.PI*getRadius()*height;
	}
	//override the inherited method to describe itself
	@Override
	public String toString(){
		return "Cylinder [ height = "+height+", "+super.toString()+" ]";
	}
}