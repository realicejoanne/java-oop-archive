import java.util.Scanner;
public class Lat5 {
	public static void main(String args[]) {
		System.out.println("Patricia Joanne 140810160065");
		String huruf, akhir="";
		int panjang;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan kata: ");
		huruf = in.nextLine();
		panjang = huruf.length();
		
		for (int i=panjang-1;i>=0;i--) {
			akhir+=huruf.charAt(i);
		}
		System.out.println("Kebalikan: "+akhir);
	}
}