import java.util.Scanner;
import java.text.DecimalFormat;

public class Tgs2 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		int a,b,c;
		double d,x1,x2;
		DecimalFormat df = new DecimalFormat("#.##");
		Scanner input = new Scanner(System.in);
		
		System.out.println("\nMencari akar-akar persamaan kuadrat");
		System.out.println("Akar kuadrat: ax^2 + bx + c = 0");
		System.out.println("Rumus determinan: D = b^2 - 4ac");
		System.out.println("-----------------------------------");
		System.out.print("Masukkan nilai a: ");
			a = input.nextInt();
		System.out.print("Masukkan nilai b: ");
			b = input.nextInt();
		System.out.print("Masukkan nilai c: ");
			c = input.nextInt();
		System.out.println("-----------------------------------");
		d = (b*b)-(4*a*c);
		System.out.println("Det = "+d);
		
		if(d==0){
			x1 = -b/2*a;
			x2 = x1;
			System.out.println("\nAkar real kembar yaitu "+x1+" dan "+x2);
		}
		else if(d>0){
			x1 = ((-b+Math.sqrt(d))/(2*a));
			x2 = ((-b-Math.sqrt(d))/(2*a));
			System.out.println("\nAkar real berlainan yaitu "+df.format(x1)+" dan "+df.format(x2));
		}
		else {
			System.out.println("\nAkar imajiner");
		}
	}
}
		
		
		
		
		