public class LongInt {
	public static void main(String[] args){
		Long l = new Long("12");
		Integer i;
		System.out.println("Long value : "+l);
		i = l.intValue();
		System.out.println("Changed to Integer : "+i);
		l = i.longValue();
		System.out.println("Changed back to Integer : "+l);
	}
}
