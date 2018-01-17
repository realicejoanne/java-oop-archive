import java.util.Scanner;
 
public class Main {
	public static Scanner g = new Scanner(System.in);
	public static void main(String[] args){
		int angka;
		try {
			System.out.print("Masukkan angka = ");
			angka = g.nextInt();
		}
		catch(Exception e){
			System.out.println("Input yang anda masukkan bukan angka!");
		}
	}
}