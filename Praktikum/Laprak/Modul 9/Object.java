public class Object {
	public static void main(String[] args){
		try {
			throw new Exception("kesalahan terjadi");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
