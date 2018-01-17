// Input sembarang bilangan bulat
// output : bil genap, ganjil, nol, negatif
import java.util.Scanner;

public class LatihanIF{
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		boolean cek=false;
		//int nilai=0;
		Scanner masuk =new Scanner(System.in);
		byte nilai=(byte)masuk.nextInt();
		if (nilai<0){
			System.out.println("Negatif");
		}
		else if (nilai==0){
			System.out.println("nol");
		}
		else if (nilai %2 ==0){
			System.out.println("Genap");
		}
		else
			System.out.println("Ganjil");
	}
}