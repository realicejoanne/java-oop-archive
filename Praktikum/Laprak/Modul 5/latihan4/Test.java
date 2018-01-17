import perbankan.Tabungan;
import perbankan.PenyimpananUang;

public class Test {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		PenyimpananUang tabungan = new PenyimpananUang(5000, 8.5/100);
		System.out.println("Uang yang ditabung: 5000");
		System.out.println("Tingkat bunga sekarang: 8.5%");
		System.out.println("Total uang sekarang: "+tabungan.cekUang());
	}
}