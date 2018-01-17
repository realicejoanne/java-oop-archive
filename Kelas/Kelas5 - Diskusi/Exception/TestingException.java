public class TestingException {
	public static void main(String[] args){
		try {
			int[] angka = { 32,12,43,67,45 };
			System.out.println(angka[6]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Index array tidak tersedia!");
		}
	}
}