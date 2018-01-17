import java.util.Scanner;

public class Biner{
	public static void main (String[] args){
		System.out.println("Author : Patricia Joanne 140810160065\n");
		
		Biner konversi = new Biner();
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan bilangan desimal: ");
		int x = input.nextInt();
		System.out.println("Susunan bit dari "+x+" adalah "+konversi.Konversi(x));
	}
	
	public String Konversi (int x){
		StringBuilder b = new StringBuilder();
		for(int i=31;i>=0;i--){
			b.append((x&(1<<i))>>>i);
		}
		return b.toString();
	}
}