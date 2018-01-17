public class Tgs4 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		String kalimat = "Selamat datang di PENS";
		
		System.out.println("Kalimat\t\t: "+kalimat);
		System.out.println("Upper case\t: "+kalimat.toUpperCase());
		System.out.println("Lower case\t: "+kalimat.toLowerCase());
		
		System.out.println("Panjang kalimat\t: "+kalimat.length());
		System.out.println("Indeks kata PENS: "+kalimat.indexOf("PENS")+"-"+(kalimat.indexOf("PENS")+"PENS".length()-1));
	}
}
		