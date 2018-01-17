public class TestBoxa{
	public static void main(String[] args){
		Boxa b = new Boxa();
    
		b.add(10);
		b.add("Hello World");

		System.out.printf("Integer Value : %d\n\n", b.getInt());
		System.out.printf("String Value : %s\n", b.getString());
	}
}