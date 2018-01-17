import java.util.Scanner;

public class JamMenit {
	public static void main(String args[]) {
		System.out.println("Author : Patricia Joanne 140810160065\n");
		Scanner input = new Scanner(System.in);
		int durasi;
		
		System.out.println("^^Input waktu masuk^^");
		System.out.print("Jam: ");
		int jamIn = input.nextInt();
		System.out.print("Menit: ");
		int mntIn = input.nextInt();
		
		System.out.println("^^Input waktu keluar^^");
		System.out.print("Jam: ");
		int jamOut = input.nextInt();
		System.out.print("Menit: ");
		int mntOut = input.nextInt();
		
		durasi = (jamOut-jamIn)*60 + (mntOut-mntIn);
		System.out.println("\nDurasi waktu dalam menit: "+durasi);
	}
}