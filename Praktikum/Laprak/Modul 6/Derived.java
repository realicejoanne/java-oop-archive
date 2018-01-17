public class Derived extends Basee {
	int i = -1;
	public static void main(String argv[]){
		Basee b = new Derived();
		System.out.println(b.i);
		b.amethod();
	}
	public void amethod(){
		System.out.println("Derived.amethod()");
	}
}