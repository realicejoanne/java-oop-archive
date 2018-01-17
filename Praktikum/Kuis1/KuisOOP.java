// KuisOOP: TestJava

class KuisOOP {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065\n");
		
		//Buyer
		Buyer pembeli = new Buyer(); 
		pembeli.setName("Heru"); 
		pembeli.setAge(25);
		pembeli.setAddress("Tanjungsari, Sumedang");
		
		System.out.println("-- Data Pembeli --\n");
		System.out.println("Nama\t: "+pembeli.getName());
		System.out.println("Usia\t: "+pembeli.getAge());
		System.out.println("Alamat\t: "+pembeli.getAddress());
		
		//Car
		Pickup mobil1 = new Pickup();
		mobil1.setCarType("Pickup");
		mobil1.setBrand("Toyota");
		mobil1.setPrice(500000);
		mobil1.setMaxLoad(125);
		
		Sport mobil2 = new Sport();
		mobil2.setCarType("Sport");
		mobil2.setBrand("Pajero");
		mobil2.setPrice(850000);
		mobil2.setNitro("Nitro");
		
		System.out.println("\n-- Data Pembelian Mobil --\n");
		System.out.println("No\tTipe\tMerk\tHarga\t\tFitur");
		System.out.println("----------------------------------------------");
		System.out.println("1.\t"+mobil1.getCarType()+"\t"+mobil1.getBrand()+"\t"+mobil1.getPrice()+"\t"+mobil1.getMaxLoad());
		System.out.println("2.\t"+mobil2.getCarType()+"\t"+mobil2.getBrand()+"\t"+mobil2.getPrice()+"\t"+mobil2.getNitro());
		
		//Purchase
		/*
		Purchase.addPurchaseData(pembeli,mobil1);
		Purchase.addPurchaseData(pembeli,mobil2);
		
		Purchase.showPurchaseData();
		System.out.println("Total harga\t:"+Purchase.getTotalCarPrice());*/
	}
}