import java.util.*;

public class CariDuplikasi2 {
	public static void main(String[] args) {
		Set<String> unik = new HashSet<String>();
		Set<String> duplikat = new HashSet<String>();
		for (String a : args)
			if (!unik.add(a))
				duplikat.add(a);
			unik.removeAll(duplikat);
			System.out.println("Kata unik: " +unik);
			System.out.println("Kata duplikat: " +duplikat);
	}
}