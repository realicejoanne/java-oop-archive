//A test driver for Shape and its subclasses

public class TestShape {
	public static void main(String[] args){
		Shape s1 = new Rectangle("red", 4, 5); //upcast
		System.out.println(s1); //run Rectangle's toString()
		System.out.println("Area is "+s1.getArea()); //run Rectangle's getArea()
		
		Shape s2 = new Triangle("blue", 4, 5); //upcast
		System.out.println(s2); //run Triangle's toString()
		System.out.println("Area is "+s2.getArea()); //run Triangle's getArea()
		
		Shape s3 = new Shape("green");
		System.out.println(s3);
		System.out.println("Area is "+s3.getArea());
	}
}