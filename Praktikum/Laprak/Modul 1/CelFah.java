import java.util.Scanner;

public class CelFah{
	public static void main (String[] args){
		System.out.println("Author : Patricia Joanne 140810160065\n");
		
		float hasilCel,hasilFah;
		System.out.println("Pilih konversi: ");
		System.out.println("1. Celcius ke Fahrenheit");
		System.out.println("2. Fahrenheit ke Celcius");
		
		System.out.print("Masukkan pilihan: ");
		Scanner input = new Scanner(System.in);
		int pil = input.nextInt();
		
		if(pil == 1){
			System.out.println("\n^^Celcius ke Fahrenheit^^");
			System.out.print("Input suhu dalam Celcius: ");
			float cel = input.nextFloat();
			hasilFah = (cel*9/5)+32;
			System.out.println(cel+" Celcius = "+hasilFah+" Fahrenheit");
		}
		else if(pil == 2){
			System.out.println("\n^^Fahrenheit ke Celcius^^");
			System.out.print("Input suhu dalam Fahrenheit: ");
			float fah = input.nextFloat();
			hasilCel = (fah-32)*5/9;
			System.out.println(fah+" Fahrenheit = "+hasilCel+" Celcius");
		}
		else {
			System.out.println("Pilihan konversi tidak tersedia");
		}
	}
}