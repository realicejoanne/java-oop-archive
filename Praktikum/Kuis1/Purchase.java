/* Purchase
buyer:Buyer[5]; car:Car[5]; totalPurchase:int=0;
*/

public class Purchase {
	private Buyer[] buyer;
	private Car[] car;
	private int totalPurchase = 0;
	
	public void addPurchaseData(Buyer buyer, Car car){
		this.buyer[5] = new Buyer();
		this.car[5] = new Car();
		this.buyer[totalPurchase] = buyer;
		this.car[totalPurchase] = car;
		totalPurchase+=1;
	}
	
	public void showPurchaseData(){
		for(int i=0;i<totalPurchase;i++){
			System.out.println(+i+" "+buyer[i]+" "+car[i]);
		}
	}
	
	public double getTotalCarPrice(){
		int sum = 0;
		for (int i=0;i<totalPurchase;i++){
			sum += car[i].getPrice();
		}
		return sum;
	}
}
