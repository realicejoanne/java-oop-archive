public class Test7 {
	public static void main (String args[]){
		System.out.println("Patricia Joanne 140810160065");
		Mahasiswa anak = new Mahasiswa(65, "Patricia Joanne");
		System.out.println(anak.getNpm());
		System.out.println(anak.getNama());
	}
}

class Mahasiswa {
	private int npm;
	private String nama;
	public Mahasiswa(){
		this(0,"");
	}
	public Mahasiswa(String nama){
		this(0,nama);
	}
	public Mahasiswa(int npm, String nama){
		this.npm=npm;
		this.nama=nama;
	}
	public int getNpm(){
		return npm;
	}
	public String getNama(){
		return nama;
	}
}