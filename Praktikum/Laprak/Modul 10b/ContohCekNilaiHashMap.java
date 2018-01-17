import java.util.HashMap;
public class ContohCekNilaiHashMap {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		boolean blAda = hMap.containsValue("Dua");
		System.out.println("Apakah Dua ada dalam HashMap? "+blAda);
	}
}