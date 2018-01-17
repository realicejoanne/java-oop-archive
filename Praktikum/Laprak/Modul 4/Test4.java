public class Test4 {
	public static void main(String args[]){
	System.out.println("Patricia Joanne 140810160065");
	Siswa anak = new Siswa(44, "Demi Lovato");
	System.out.println(anak.nrp);
	System.out.println(anak.nama);
	anak.setNrp(65);
	anak.setNama("Patricia Joanne");
	System.out.println(anak.nrp);
	System.out.println(anak.nama);
	}
}

class Siswa {
	public int nrp;
	public String nama;
	public Siswa(int nrp, String nama){
		this.nrp=nrp;
		this.nama=nama;
	}
	public void setNrp(int nrp){
		this.nrp=nrp;
	}
	public void setNama(String nama){
		this.nama=nama;
	}
	public int getNrp(){
		return nrp;
	}
	public String getNama(){
		return nama;
	}
}