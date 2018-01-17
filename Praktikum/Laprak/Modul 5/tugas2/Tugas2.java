import transportasi.*;

public class Tugas2 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065\n");
		Truk truk1=new Truk();
		truk1.setJmlRoda(4);
		truk1.setWarna("Kuning");
		truk1.setBahanBakar("Solar");
		truk1.setKapasitasMesin(1500);
		truk1.setMuatanMaks(5000);
		
		Truk truk2=new Truk();
		truk2.setJmlRoda(6);
		truk2.setWarna("Merah");
		truk2.setBahanBakar("Solar");
		truk2.setKapasitasMesin(2000);
		truk2.setMuatanMaks(5000);
		
		Taksi taksi1=new Taksi();
		taksi1.setJmlRoda(4);
		taksi1.setWarna("Oranye");
		taksi1.setBahanBakar("Bensin");
		taksi1.setKapasitasMesin(1500);
		taksi1.setTarifAwal(10000);
		taksi1.setTarifPerKm(5000);
		
		Taksi taksi2=new Taksi();
		taksi2.setJmlRoda(4);
		taksi2.setWarna("Biru");
		taksi2.setBahanBakar("Bensin");
		taksi2.setKapasitasMesin(1300);
		taksi2.setTarifAwal(7000);
		taksi2.setTarifPerKm(3500);
		
		Sepeda sepeda1=new Sepeda();
		sepeda1.setJmlRoda(3);
		sepeda1.setWarna("Hitam");
		sepeda1.setJmlSadel(1);
		sepeda1.setJmlGir(2);
		
		Sepeda sepeda2=new Sepeda();
		sepeda2.setJmlRoda(2);
		sepeda2.setWarna("Putih");
		sepeda2.setJmlSadel(2);
		sepeda2.setJmlGir(5);
		
		System.out.println("Obyek\tjmlRoda\twarna\tbahanBakar\tKapasitasMesin\tmuatanMaks");
		System.out.println("================================================================================");
		System.out.println("Truk1\t"+truk1.getJmlRoda()+"\t"+truk1.getWarna()+"\t"+truk1.getBahanBakar()
							+"\t\t"+truk1.getKapasitasMesin()+"\t\t"+truk1.getMuatanMaks());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Truk2\t"+truk2.getJmlRoda()+"\t"+truk2.getWarna()+"\t"+truk2.getBahanBakar()+"\t\t"
							+truk2.getKapasitasMesin()+"\t\t"+truk2.getMuatanMaks());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\ttarifAwal\ttrfPerKm");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Taksi1\t"+taksi1.getJmlRoda()+"\t"+taksi1.getWarna()+"\t"+taksi1.getBahanBakar()+"\t\t"
							+taksi1.getKapasitasMesin()+"\t\t"+taksi1.getTarifAwal()+"\t\t"+taksi1.getTarifPerKm());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Taksi2\t"+taksi2.getJmlRoda()+"\t"+taksi2.getWarna()+"\t"+taksi2.getBahanBakar()+"\t\t"
							+taksi2.getKapasitasMesin()+"\t\t"+taksi2.getTarifAwal()+"\t\t"+taksi2.getTarifPerKm());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.print("\t\t\tjmlSadel\tjmlGir\n");
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("Sepeda1\t"+sepeda1.getJmlRoda()+"\t"+sepeda1.getWarna()+"\t"
							+sepeda1.getJmlSadel()+"\t\t"+sepeda1.getJmlGir());
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Sepeda2\t"+sepeda2.getJmlRoda()+"\t"+sepeda2.getWarna()+"\t"
							+sepeda2.getJmlSadel()+"\t\t"+sepeda2.getJmlGir());		
	}
}
