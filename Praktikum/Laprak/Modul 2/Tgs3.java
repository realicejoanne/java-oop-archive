import java.util.Scanner;

public class Tgs3 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nMenentukan tahun kabisat");
		System.out.print("Masukkan tahun (1900-2016): ");
		n = input.nextInt();
		
		if(n>=1900&&n<=2016){
			if(n%4==0){
				System.out.println(n+" adalah tahun kabisat");
			}
			else System.out.println(n+" bukan tahun kabisat");
		}
		else if(n<1900) System.out.println("Maaf, tahun input di bawah 1900");
		else System.out.println("Maaf, tahun input di atas 2016");
	}
}