enum Apel {		
	MALANG(5000), GRANNYSMITH(6000), PINKLADY(6500),
	GOLDENDELICIOUS(8000), REDDELICIOUS(9000);
	
	String nama;
	int harga;
	Apel(int h){
		harga = h;
	}
	public String getDeskripsi(){
		return ("Apel ini harganya "+harga);
	}
};	

class TestApel{
	static Apel apel1;
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		System.out.println(" ");
		System.out.println("Nama Apel\t\t| Harga\t| Deskripsi ");
		System.out.println("--------------------------------------------------------");
		System.out.println("APEL " + apel1.MALANG +"\t\t| "
			+ apel1.MALANG.harga +"\t| "+ apel1.MALANG.getDeskripsi());
		System.out.println("APEL " + apel1.GRANNYSMITH +"\t| "
			+ apel1.GRANNYSMITH.harga +"\t| "+ apel1.GRANNYSMITH.getDeskripsi());
		System.out.println("APEL " + apel1.PINKLADY +"\t\t| "
			+ apel1.PINKLADY.harga +"\t| "+ apel1.PINKLADY.getDeskripsi());
		System.out.println("APEL " + apel1.GOLDENDELICIOUS +"\t| "
			+ apel1.GOLDENDELICIOUS.harga +"\t| "+ apel1.GOLDENDELICIOUS.getDeskripsi());
		System.out.println("APEL " + apel1.REDDELICIOUS +"\t| "
			+ apel1.REDDELICIOUS.harga +"\t| "+ apel1.REDDELICIOUS.getDeskripsi());
	}
}
