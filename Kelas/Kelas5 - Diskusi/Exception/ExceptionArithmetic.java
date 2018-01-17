public class ExceptionArithmetic {
	public static void main(String[] args){
		int hasil = bagi(10,0); //pembagian 10 dengan 0 (error)
		System.out.println("Hasil: "+hasil);
		hasil = bagi(10,2);
		System.out.println("Hasil: "+hasil);
	}
	
	public static int bagi(int pembilang, int pembagi){
		int hasilBagi = -1;
		System.out.println("Pembagian: "+pembilang+" dengan "+pembagi);
		try { hasilBagi = pembilang/pembagi; }
		catch (Exception e){
			System.out.println("Pesan exception: "+e.getMessage());
		}
		finally {
			if(hasilBagi!=-1){
				System.out.println("Statement finally dijalankan!");
				System.out.println("Hasil fungsi: "+hasilBagi);
			}
			else {
				System.out.println("Statement finally dijalankan, terjadi exception!");
				System.out.println("Hasil fungsi: "+hasilBagi);
				return hasilBagi;
			}
		}
		return hasilBagi;
	}
}


