public class EnumApple {
	public static void main(String args[]){
		Apple ap;
		System.out.println("A: "+Apple.A.getPrice());
		System.out.println("All apple prices:");
		for (Apple a : Apple.values()){
			System.out.println(a+" costs "+a.getPrice()+" cents.");
		}
	}
}