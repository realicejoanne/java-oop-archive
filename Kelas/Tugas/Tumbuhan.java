public class Tumbuhan {
	int tinggi;
	String nama;
	String jenisAkar;
	public Tumbuhan(int tinggi, String nama){
		this.tinggi = tinggi;
		this.nama = nama;
	}
	public String getAkar(){
		return jenisAkar;
	}
	public String getNama(){
		return nama;
	}
	public int getTinggi(){
		return tinggi;
	}
}