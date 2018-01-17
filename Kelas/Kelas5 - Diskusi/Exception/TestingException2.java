public class TestingException2 {
	public static void main(String[] args){
		try {
			String myString = "Coba";
			int angka = Integer.parseInt(myString);
			System.out.println(angka);
		}
		catch (NumberFormatException e){
			System.out.println(e.getMessage());
		}
	}
}