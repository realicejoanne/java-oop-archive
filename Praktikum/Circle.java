class Circle { 
    private double area; 
    private double radius; 
    private String color; 
    
    public Circle(){ 
      this.radius=1.0; 
      this.color="red"; 
    } 
    
    public Circle(double radius){ 
      this.radius=radius; 
    } 
	
	public double getRadius(){ 
      return radius; 
    } 

	public double getArea(){ 
      area = Math.PI*radius*radius; 
      return area; 
    }
	
	public String toString(){ 
      return "Circle[Radius = "+radius+", color = "+color+"]"; 
    }
}