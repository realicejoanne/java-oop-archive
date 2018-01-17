package tes;

class Kendaraan {
	public String merk;
	public static int jmlRoda;
	
	Kendaraan(String merk){
		this.merk=merk;
	}
	
	void cetak(){
		System.out.println("Merk; "+this.merk);
	}
	
	public static void main(String args[]){
		//cara pertama memanggil member class (this)
		/*this.jmlRoda=4;
		System.out.println("Cara pertama: "+this.jmlRoda);*/
		
		//cara kedua memanggil member class (nama objek)
		Kendaraan mbl = new Kendaraan("Daihatsu");
		System.out.println("Cara kedua: "+mbl.merk);
		
		//cara ketiga memanggil member class (nama class)
		Kendaraan.jmlRoda=4;
		System.out.println("Cara ketiga: "+Kendaraan.jmlRoda);
	}
}