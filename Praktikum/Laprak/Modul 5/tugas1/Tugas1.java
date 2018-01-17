import bank.*;

public class Tugas1{
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065\n");
		PengambilanUang tabungan = new PengambilanUang(5000, 1000);
		System.out.println("Uang yang ditabung: 5000");
		System.out.println("Uang yang diproteksi: 1000");
		System.out.println("----------------------------");
		System.out.println("Uang yang akan diambil: 4500 " +tabungan.ambilUang(4500));
		System.out.println("Saldo sekarang: "+tabungan.getSaldo());
		System.out.println("----------------------------");
		System.out.println("Uang yang akan diambil: 2500 " +tabungan.ambilUang(2500));
		System.out.println("Saldo sekarang: "+tabungan.getSaldo());		
	}
}