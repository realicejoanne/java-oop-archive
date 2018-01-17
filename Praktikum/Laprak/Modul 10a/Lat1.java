import java.util.*;

public class Lat1 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		Set<Integer> a = new HashSet<Integer>();
		for (int i=1; i<=5; i++)
			a.add(i);
		Set<Integer> b = new HashSet<Integer>();
		for(int i=5; i<=10; i++)
			b.add(i);
		System.out.println("Set A = " + a);
		System.out.println("Set B = " + b);

		Set<Integer> min = new TreeSet<Integer>(a);
		min.removeAll(b);
		System.out.println("\nA - B = " + min);
		
		Set<Integer> irisan = new TreeSet<Integer>(a);
		irisan.retainAll(b);
		System.out.println("A n B = " +irisan);

		Set<Integer> gabung = new TreeSet<Integer>(a);
		gabung.addAll(b);
		System.out.println("A u B = " +gabung);

		System.out.println("A c B = " +b.containsAll(a));
	}
}
