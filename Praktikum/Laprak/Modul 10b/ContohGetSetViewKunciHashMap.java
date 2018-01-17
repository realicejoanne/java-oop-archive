import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ContohGetSetViewKunciHashMap {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		Set st = hMap.keySet();
		System.out.println("Set yang dibuat dari HashMap Keys: ");
		Iterator itr = st.iterator(); while(itr.hasNext())
		System.out.println(itr.next());
		st.remove("2");
	}
}