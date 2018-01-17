public class ShowEnum {
    public void show(){
		Kendaraan kap = Kendaraan.valueOf("Kapal");
		Kendaraan pes = Kendaraan.valueOf("Pesawat");
		Kendaraan mob = Kendaraan.valueOf("Mobil");
		Kendaraan Mot = Kendaraan.valueOf("Motor");
     
		System.out.println(
			"Nama Kendaraan: " +kap+"\n"+
			"Nama Kendaraan: " +pes+"\n"+
            "Nama Kendaraan: " +mob+"\n"+
            "Nama Kendaraan: " +Mot);
    }
	public static void main(String[] args){
        ShowEnum showOut = new ShowEnum();
        showOut.show();
    } 
}