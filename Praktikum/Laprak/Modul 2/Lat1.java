public class Lat1 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		char karakter = 'a';
		System.out.print("Masukkan karakter: ");
		try {
			karakter = (char)System.in.read();
		}
		catch (Exception e){
			System.out.println("Error: " +e.toString());
		}
		
		if(karakter>='a'&&karakter<='z') System.out.println("Huruf kecil");
		else if(karakter>='A'&&karakter<='Z') System.out.println("Huruf besar");
		else if(karakter>='0'&&karakter<='9') System.out.println("Angka");
		else System.out.println("Karakter khusus");
	}
}