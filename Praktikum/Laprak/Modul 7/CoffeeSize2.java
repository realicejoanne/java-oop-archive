enum CoffeeSize2 {
	BIG(8), HUGE(10), OVERWHELMING(16);
	CoffeeSize2(int ounces){
		this.ounces = ounces;
	}
	private int ounces;
	public int getOunces(){
		return ounces;
	}
}