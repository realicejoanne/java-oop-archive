import java.util.Scanner;

class KonvBasis {
	public static void main(String[] args){
		String bil, basis;
		int bil2;
		Scanner in = new Scanner(System.in);
		System.out.print("\nMasukkan bilangan : ");
		bil = in.next();
		System.out.print("Basis : ");
		basis = in.next();

		switch(basis){
			case "2":
				bil2 = Integer.parseInt(bil,2);
				System.out.println("desimal : "+bil2+ 
					" oktal : " +Integer.toOctalString(bil2)+
					" heksa : " +Integer.toHexString(bil2));
				break;
			case "8":
				bil2 = Integer.parseInt(bil,8);
				System.out.println("biner : " +Integer.toBinaryString(bil2)+
					" desimal : " +bil2+
					" heksa : "+Integer.toHexString(bil2));
				break;
			case "10":
				bil2 = Integer.parseInt(bil,10);
				System.out.println("biner : "+Integer.toBinaryString(bil2)+
					" oktal : "+Integer.toOctalString(bil2)+
					" heksa : "+Integer.toHexString(bil2));
				break;
			case "16":
				bil2 = Integer.parseInt(bil,16);
				System.out.println("biner : "+Integer.toBinaryString(bil2)+
					" oktal : "+Integer.toOctalString(bil2)+
					" desimal : "+bil2);
				break;
			default:
				System.out.println("Basis tidak ada!");
				break;
		}
	}
}
