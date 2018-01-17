public class Test3 {
	public static void main (String args[]){
		System.out.println("Patricia Joanne 140810160065");
		Siswa anak = new Siswa(41);
		System.out.println(anak.nrp);
		anak.setNrp(65);
		System.out.println(anak.nrp);
	}
}

class Siswa {
	public int nrp;
	public Siswa(int i) {
		nrp=i;
	}
	public void setNrp(int i) {
		nrp=i;
	}
	public int getNrp() {
		return nrp;
	}
}