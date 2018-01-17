public class Test6 {
	public static void main (String args[]){
		System.out.println("Patricia Joanne 140810160065");
		Mahasiswa anak = new Mahasiswa(65, "Patricia Joanne");
		System.out.println(anak.npm);
		System.out.println(anak.nama);
	}
}

class Mahasiswa {
	public int npm;
	public String nama;
	
	public Mahasiswa(int npm, String nama) {
		this.npm=npm;
		this.nama=nama;
	}
}