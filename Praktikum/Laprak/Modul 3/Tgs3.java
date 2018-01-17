import java.util.Scanner;

public class Tgs3 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		
		Scanner in = new Scanner(System.in);
		String kalimat;
		char key;
		
		System.out.print("Masukkan kalimat: ");
		kalimat = in.nextLine().replaceAll("\\s","");
		System.out.print("Cari karakter: ");
		key = in.next().charAt(0);
		
		int i=0;
		System.out.print("Karakter "+key+" terdapat pada indeks ke-");
		do  {
			if(key==kalimat.charAt(i)) System.out.print(i+".");
			i++;
		}
		while (i<kalimat.length());
	}
}