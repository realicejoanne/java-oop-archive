public class Katak {
	int umur;
	String nama;
	String gerak;
	public Katak(int umur, String nama){
		this.umur = umur;
		this.nama = nama;
	}
	public String caraBergerak(){
		return gerak;
	}
	public String getNama(){
		return nama;
	}
	public int getUmur(){
		return umur;
	}
}