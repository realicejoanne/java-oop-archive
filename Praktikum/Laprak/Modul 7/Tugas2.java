import java.util.Scanner;

public class Tugas2 {
	static Scanner read = new Scanner(System.in);
	private static void dariInt(){
		int angka;
		System.out.println("Dari int");
		System.out.print("Masukkan angka : ");
		angka = read.nextInt();
		Integer i = new Integer(angka);
		String iString = Integer.toString(i);
		System.out.println("\nBentuk Integer : " +i);
		System.out.println("Bentuk String : " +iString);
	}
	
	private static void dariString(){
		String masuk;
		System.out.println("Dari String");
		System.out.print("Masukkan angka : ");
		masuk = read.next();
		Integer i = Integer.valueOf(masuk);
		int i2 = i;
		System.out.println("\nBentuk Integer : " +i);
		System.out.println("Bentuk int : " +i2);
	}
	
	private static void dariInteger(){
		System.out.println("Dari Integer");
		System.out.print("Masukkan angka : ");
		Integer angka = read.nextInt();
		int i = angka;
		double iD = angka;
		float iF = angka;
		Double doubleObj = new Double(angka);
		String stringObj = Integer.toString(angka);
		Float floatObj = new Float(angka);
		Long longObj = new Long(angka);
		
		System.out.println("\nBentuk int : "+i);
		System.out.println("Bentuk String : "+stringObj);
		System.out.println("Bentuk double (primitif) : "+iD);
		System.out.println("Bentuk float (primitif) : "+iF);
		System.out.println("Bentuk Wrapper lain (Double) : "+doubleObj);
		System.out.println("Bentuk Wrapper lain (Float) : "+floatObj);
		System.out.println("Bentuk Wrapper lain (Long) : "+longObj);
	}
	
	public static void main(String[] args){
		byte pilih;
		System.out.println("Asal konversi : ");
		System.out.println("1. String ");
		System.out.println("2. int ");
		System.out.println("3. Integer ");
		System.out.print("Pilihan : ");
		pilih = read.nextByte();
		System.out.println();
		switch(pilih){
			case 1:
				dariString();
				break;
			case 2:
				dariInt();
				break;
			case 3:
				dariInteger();
				break;
			default:
				System.out.println("Invalid input");
				break;
		}
	}
}
