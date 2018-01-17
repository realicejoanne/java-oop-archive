enum Apple {
	A(10), B(9), C, D(15), E(8);
	private int price;
	Apple(int p){
		price = p;
	}
	Apple(){
		price = -1;
	}
	int getPrice(){
		return price;
	}
}