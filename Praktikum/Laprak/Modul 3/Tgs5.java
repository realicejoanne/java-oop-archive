import java.util.Scanner;

public class Tgs5 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		StringBuffer kalimat = new StringBuffer();
		Scanner in = new Scanner(System.in);
		int index = 0;
		char chr;
		
		System.out.print("Masukkan string: ");
		kalimat.append(in.nextLine());
		kalimat.append(' ');
		
		for(int i=0;i<kalimat.length();i++){
			if(kalimat.charAt(i)==' '){
				chr = kalimat.charAt(index);
				kalimat.setCharAt(index,Character.toUpperCase(kalimat.charAt(i-1)));
				kalimat.setCharAt(i-1,Character.toLowerCase(chr));
				index=i+1;
			}
		}
		System.out.println("String hasil: "+kalimat);
	}
}