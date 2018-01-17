public class TestInteger2 {
	public static void main(String[] args){
		Integer i1 = new Integer(345);
		System.out.println("Nilai int: "+i1);
		System.out.println("Nilai binary: "+Integer.toBinaryString(i1));
		System.out.println("Nilai hexadecimal: "+Integer.toHexString(i1));
		System.out.println("Nilai octal: "+Integer.toOctalString(i1));
		Integer i2 = new Integer(675);
		System.out.println("\nNilai int: "+i2);
		System.out.println("Nilai binary: "+Integer.toString(i2, 2));
		System.out.println("Nilai hexadecimal: "+Integer.toString(i2, 8));
		System.out.println("Nilai octal: "+Integer.toString(i2, 16));
	}
}