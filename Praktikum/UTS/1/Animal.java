public class Animal {
	private int weight;
	private String[] foodList = new String[5];
	
	public Animal (int weight){
		this.weight = weight;
	}
	public Animal (int weight, String[] foodList){
		this.weight = weight;
		this.foodList = foodList;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public int getWeight(){
		return weight;
	}
	public void sound(){
		System.out.println("Foo");
	}
	public boolean canEat(String food){
		for (int i=0;i<foodList.length;i++){
			if(food == foodList[i]){
				return true;
			}
		}
		return false;
	}
	public String[] getFoodList(){
		return foodList;
	}
}