class Cylinder extends Circle { 
    private double volume; 
    private double radius; 
    private double height; 
  
    public Cylinder(){ 
      super(); 
      this.height=1.0; 
    } 
 
	public Cylinder(double height){
		this.height=height; 
    } 
 
    public Cylinder(double height, double radius){
		super(radius);
		this.height=height;
	}
	
	public double getHeight(){
		return height;
	}

	public double getVolume(){ 
      volume = getArea()*height; 
      return volume; 
    }
}
	