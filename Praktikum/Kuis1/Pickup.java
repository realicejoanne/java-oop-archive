/* Pickup extends Car
maxLoad:int;
*/

class Pickup extends Car {
	private int maxLoad;
	
	public void setMaxLoad(int maxLoad){
		this.maxLoad = maxLoad;
	}
	
	public int getMaxLoad(){
		return maxLoad;
	}
}