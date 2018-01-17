import java.util.TreeMap;

public class ContohKeyTerendahTertinggi {
	public static void main(String[] args){
		TreeMap treeMap = new TreeMap();
		treeMap.put("1","Satu");
		treeMap.put("3","Tiga");
		treeMap.put("2","Dua");
		treeMap.put("5","Lima"); 
		treeMap.put("4","Empat");
		System.out.println("Kunci terendah pada tree map adalah: "+treeMap.firstKey());
		System.out.println("Kunci tertinggi pada tree map adalah: "+treeMap.lastKey());
	}
}