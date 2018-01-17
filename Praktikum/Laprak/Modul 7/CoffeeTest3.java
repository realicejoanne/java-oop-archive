public class CoffeeTest3 {
	public static void main(String[] args){
		enum CoffeeSize {BIG, HUGE, OVERWHELMING}
		Coffee drink = new Coffee();
		drink.size = offeeSize.BIG;
		System.out.println(drink.size);
	}
}