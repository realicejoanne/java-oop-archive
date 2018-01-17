import java.util.Scanner;
import static java.lang.Math.PI;

public class Lingkaran{
	public static void main (String[] args){
		System.out.println("Author : Patricia Joanne 140810160065\n");
		
		double luas,keliling;
		System.out.println("Menghitung Luas dan Keliling Lingkaran\n");
		Scanner input = new Scanner(System.in);
		System.out.print("Input jari-jari: ");
		double jari = input.nextDouble();
		
		luas = PI*jari*jari;
		keliling = 2*PI*jari;
		
		System.out.println("\nLuas lingkaran = "+luas);
		System.out.println("\nKeliling lingkaran = "+keliling);
	}
}