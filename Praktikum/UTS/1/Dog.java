public class Dog extends Animal {
	private String fur;
	
	public Dog (int weight, String fur){
		super(weight);
		this.fur = fur;
	}
	public Dog (int weight, String[] foodlist, String fur){
		super(weight);
		foodlist[0] = "Fish";
		foodlist[1] = "Meal";
		foodlist[2] = "Chicken";
		foodlist[3] = "Whiskas";
		this.fur = fur;
	}
	public void setFur (String fur){
		this.fur = fur;
	}
	public String getFur(){
		return fur;
	}
	public void sound(){
		System.out.println("Sound: Woof!");
	}
}