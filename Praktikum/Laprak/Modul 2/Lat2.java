import java.util.Scanner;

public class Lat2 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		int n,fak=1;
		System.out.print("Masukkan bilangan faktorial: ");
		try {
			Scanner msk = new Scanner(System.in);
			n = msk.nextInt();
			System.out.println("n\tn!");
			System.out.println("------------");
			for(int i=1;i<=n;i++){
				fak=1;
				System.out.print(i+"\t");
				for(int j=1;j<=i;j++){
					fak=fak*j;
				}
				System.out.println(fak);
			}
			System.out.println("------------");
		}
		catch(Exception e){
			System.out.println("Error: "+e.toString());
		}
	}
}