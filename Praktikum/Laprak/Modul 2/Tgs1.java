import java.util.Scanner;

public class Tgs1 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		byte n;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan radius: ");
		n = input.nextByte();
		
		for(byte i=1;i<=(2*n)-1;i++){
			for(byte j=1;j<=(2*n)-1;j++){
				if(i+j<=n || j-i>=n || i-j>=n || i+j>=3*n) System.out.print("  ");
				else System.out.print ("* ");
			}
			System.out.println();
		}
	}
}