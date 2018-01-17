/* Car
carType:String; color:String; brand:String; price:double;
*/

public class Car{
	private String carType;
	private String color;
	private String brand;
	private double price;
	
	public void setCarType(String carType){
		this.carType = carType;
	}
	public String getCarType(){
		return carType;
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return color;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
}