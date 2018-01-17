import java.util.*;

public class CariDuplikasi {
	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		for(String a : args)
			if (!s.add(a))
				System.out.println("Terdeteksi duplikasi: "+a);
				System.out.println(s.size()+" kata berbeda: "+s);
	}
}