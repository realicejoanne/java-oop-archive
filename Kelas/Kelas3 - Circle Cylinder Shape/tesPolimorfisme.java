class tesPolimorfisme {
	public static void main(String args[]){
		//Substitute a subclass instance to a superclass reference
		Circle c1 = new Cylinder(1.1,2.2);
		
		//invoke superclass Circle's methods
		System.out.println(c1.getRadius());
		
		//CANNOT invoke method in Cylinder as it is a Circle reference!
		//c1.getHeight(); //compilation error
		//c1.getVolume(); //compilation error
		
		System.out.println(c1.toString()); //run to overriden version!
		System.out.println(c1.getArea()); //run to overriden version!
	}
}