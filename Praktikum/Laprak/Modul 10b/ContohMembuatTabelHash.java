import java.util.Enumeration;
import java.util.Hashtable;
import java.util.HashMap;

public class ContohMembuatTabelHash {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		Hashtable ht = new Hashtable();
		
		ht.put("1","Nilai ini harus diganti!!");
		ht.put("4","Empat");
		
		System.out.println("Isi Hashtable sebelum disalin: ");
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		ht.putAll(hMap);
		
		System.out.println("Isi Hashtable setelah disalin: ");
		e = ht.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}