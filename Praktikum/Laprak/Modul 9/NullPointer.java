public class NullPointer {
	public static void main(String[] args){
		NullPointer t = initT();
		t.foo("Hi");
	}
	private static NullPointer initT(){
		return null;
	}
	public void foo(String s){
		System.out.println(s.toLowerCase());
	}
}