public class TestAutoboxing {
	public static void main(String[] args){
		int i;
		Integer j;
		i=1;
		j=2;
		System.out.println(i);
		System.out.println(j);
		i=j;
		j=1;
		System.out.println(i);
		System.out.println(j);
	}
}