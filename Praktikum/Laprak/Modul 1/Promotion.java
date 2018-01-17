 public class Promotion{
	public static void main (String[] args){
		System.out.println("Author : Patricia Joanne 140810160065\n");
		
		char c = 'a';
		byte b = 12;
		short s = 32767;
		int i = 2147483647;
		long l = 72036854775807L;
		float f = 3.324243532f;
		double d = 3.23442323445242;
		
		System.out.println("Default value c = "+c);
        System.out.println("Default value b = "+b);
        System.out.println("Default value s = "+s);
        System.out.println("Default value i = "+i);
        System.out.println("Default value l = "+l);
        System.out.println("Default value f = "+f);
        System.out.println("Default value d = "+d);
		
        d = f;
        f = l;
        l = i;
        i = s;
        s = b;
		//c = i;
		
		System.out.println("\nAfter Promotion proses : ");
		System.out.println("\nDefault value c(int) = "+c);
        System.out.println("Default value b(short) = "+b);
        System.out.println("Default value s(byte) = "+s);
        System.out.println("Default value i(short) = "+i);
        System.out.println("Default value l (int) = "+l);
        System.out.println("Default value f (long) = "+f);
        System.out.println("Default value d (float) = "+d);
	}
}