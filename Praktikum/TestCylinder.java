public class TestCylinder {
	public static void main(String args[]){
		Circle crl = new Circle();
		System.out.println("Radius = "+crl.getRadius());
	   	System.out.println("Area = "+crl.getArea());
	
		Cylinder cyl = new Cylinder();
  		System.out.println("Radius = "+cyl.getRadius());
	   	System.out.println("Height = "+cyl.getHeight());
		System.out.println("Volume = "+cyl.getVolume());
   	}
}