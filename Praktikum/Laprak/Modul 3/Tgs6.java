import java.util.Scanner;

public class Tgs6 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		StringBuffer kel1 = new StringBuffer();
		StringBuffer kel2 = new StringBuffer();
		String temp1,temp2;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukkan nama keluarga 1: ");
		kel1.append(in.nextLine());
		System.out.print("Masukkan nama keluarga 2: ");
		kel2.append(in.nextLine());
		
		int i = kel1.length()-1;
		int j = kel2.length()-1;
		while (kel1.charAt(i)!=' ') i--;
		while (kel2.charAt(j)!=' ') j--;
		
		temp1 = kel1.substring(i+1, kel1.length());
		temp2 = kel2.substring(j+1, kel2.length());
		
		kel1.replace(i+1, kel1.length(), temp2);
		kel2.replace(j+1, kel2.length(), temp1);
		
		System.out.println("Nama keluarga pertama: "+kel1);
		System.out.println("Nama keluarga kedua: "+kel2);
	}
}
		