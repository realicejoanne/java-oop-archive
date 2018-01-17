class Siswa {
	int nrp;
	String nama;
	public void setNrp(int i) {
		nrp=i;
	}
	public void setNama(String i) {
		nama=i;
	}
}

public class Siswaa{
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		Siswa anak = new Siswa();
		anak.setNrp(041);
		anak.setNama("Patricia Joanne");
		System.out.println(anak.nama);
		System.out.println(anak.nrp);
	}
}