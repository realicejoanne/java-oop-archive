public class TestUnboxing2 {
	public static void main(String[] args){
		Integer y = new Integer(567);
		int x = y.intValue();
		System.out.println("x = "+x);
		x++;
		y = new Integer(x);
		System.out.println("y = "+y);
	}
}