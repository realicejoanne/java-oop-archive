import java.util.*;

public class LatSet {
	public static void main(String[] args){
		Set<String> s1 = new HashSet<>();
		s1.add("Surabaya");
		s1.add("Jakarta");
		s1.add("Medan");
		s1.add("Bali");
		
		Set<String> s2 = new HashSet<>();
		s2.add("Jakarta");
		s2.add("Bandung");
		
		Set<String> union = new TreeSet<>(s1);
		union.addAll(s2); // gabungan dari s1 dan s2
		print("Gabungan",union);
		
		Set<String> intersect = new HashSet<>(s1);
		intersect.retainAll(s2); // irisan dari s1 dan s2
		print("Irisan",intersect);
	}
	protected static void print(String label, Collection c){
		System.out.println("----- "+label+" ------");
		Iterator it=c.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}