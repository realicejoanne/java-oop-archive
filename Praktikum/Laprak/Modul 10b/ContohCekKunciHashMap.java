import java.util.HashMap;

public class ContohCekKunciHashMap {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		boolean blnKey = hMap.containsKey("3");
		System.out.println("Apakah 3 ada di HashMap? "+blnKey);
	}
}