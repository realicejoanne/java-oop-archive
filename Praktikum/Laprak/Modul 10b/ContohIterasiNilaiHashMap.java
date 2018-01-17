import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ContohIterasiNilaiHashMap {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		Collection c = hMap.values();
		Iterator itr = c.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}