public class AnimalArray {
	private Animal[] animals = new Animal[2];
	private int totalAnimal = 0;
	
	public void AnimalArray(int arraySize){	
	}
	public void addAnimal(Animal animal){
		this.animals[totalAnimal] = animal;
		totalAnimal++;
	}
	
	public int getTotalAnimal(){
		return totalAnimal;
	}
	
	public void printAllAnimal(){
		System.out.println("Patricia Joanne 140810160065");
		for (int i=0;i<totalAnimal;i++){
			if(animals[i] instanceof Dog)
				System.out.println("Animal instance: Dog");
			else
				System.out.println("Animal instance: Regular Animal");
			
			System.out.println("Weight: " +animals[i].getWeight());
			String[] foodList = animals[i].getFoodList();
			System.out.print("Food List: ");
			for (int j=0; j<4; j++){
				System.out.print(foodList[j] +", ");
			}
			System.out.println();
			if(animals[i] instanceof Dog)
				System.out.println("Fur: " +animals[i].getFur());
			animals[i].sound();
			System.out.println();
		}
	}
}