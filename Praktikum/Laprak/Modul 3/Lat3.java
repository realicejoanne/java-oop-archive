import java.util.Scanner;

public class Lat3 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		Scanner show = new Scanner(System.in);
		System.out.print("Masukkan sebuah angka: ");
		int n = show.nextInt();
		int i=1,prima=0;
		
		while(i<=n){
			if(n%i==0) {
				prima++;
			}
			i++;
		}
		if (prima==2){
			System.out.print("Bilangan prima");
		}
		else System.out.print("Bilangan bukan prima");
	}
}