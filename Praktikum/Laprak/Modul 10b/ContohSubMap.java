import java.util.TreeMap;
import java.util.SortedMap;

public class ContohSubMap {
	public static void main(String[] args){
		TreeMap treeMap = new TreeMap();
		treeMap.put("1","Satu");
		treeMap.put("3","Tiga");
		treeMap.put("2","Dua");
		treeMap.put("5","Lima");
		treeMap.put("4","Empat");
		SortedMap sortedMap = treeMap.subMap("2","5");
		System.out.println("Sub Map memiliki: " +sortedMap);
	}
}