public class Test5 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		Siswa anak = new Siswa(65, "Patricia Joanne");
	}
}

class Siswa {
	private int nrp;
	private String nama;
	public Siswa(){
		nrp=0;
		nama="";
		System.out.println("Nama: "+nama+" Nrp: "+nrp);
	}
	public Siswa(String nama){
		nrp=0;
		this.nama=nama;
		System.out.println("Nama: "+nama+" Nrp: "+nrp);
	}
	public Siswa(int nrp,String nama){
		this.nrp=nrp;
		this.nama=nama;
		System.out.println("Nama: "+nama+" Nrp: "+nrp);
	}
}