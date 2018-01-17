import java.util.Scanner;

public class Konversion {
	public static void main(String[] args){
		int angka;
		Scanner read = new Scanner(System.in);
		System.out.print("Masukkan bilangan: ");
		angka = read.nextInt();
		
		System.out.print("Biner : ");
		printBinary(angka);
		System.out.print("\nOktal : ");
		printOctal(angka);
		System.out.print("Heksadesimal : ");
		printHex(angka);
	}
	
	private static void printBinary(int angka){
        int remainder;
        if (angka <= 1) {
            System.out.print(angka);
            return;   
        }
        remainder = angka %2; 
        printBinary(angka >> 1);
        System.out.print(remainder);
	}
	
	private static void printOctal(int angka){
		int rem;
		String str=""; 
		char dig[]={'0','1','2','3','4','5','6','7'};
	 
		while(angka>0){
		   rem=angka%8; 
		   str=dig[rem]+str; 
		   angka=angka/8;
		}
		System.out.println(str);
	}
	
	private static void printHex(int angka){
		char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', 
		'8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
		StringBuilder hexBuilder = new StringBuilder(8);
		hexBuilder.setLength(8);
		for (int i=8-1;i>=0;--i){
		  int j = angka&0x0F;
		  hexBuilder.setCharAt(i,hexDigits[j]);
		  angka>>=4;
		}
		System.out.println(hexBuilder); 
	}
}
