public class TestUnboxing {
	public static void main(String[] args){
		int i;
		Integer j;
		i=1;
		j=new Integer(2);
		System.out.println(i);
		System.out.println(j);
		i=j.intValue();
		j=new Integer(i);
		System.out.println(i);
		System.out.println(j);
	}
}