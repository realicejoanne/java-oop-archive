public class Example1 {
	public static void main(String args[]){
		counter aCounter = new counter();
		aCounter.zero();
		aCounter.up();
		try {
			aCounter.down();
		}
		catch(counterException ce){
			System.out.println("" +ce);
		}
		try {
			aCounter.down();
		}
		catch(counterException ce){
			System.out.println("" +ce);
		}
		finally {
		System.out.println("Finally");
		}
	}
}