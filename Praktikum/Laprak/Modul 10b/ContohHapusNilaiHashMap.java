import java.util.HashMap;
	public class ContohHapusNilaiHashMap {
	public static void main(String[] args){
		HashMap hMap = new HashMap();
		hMap.put("1","Satu");
		hMap.put("2","Dua");
		hMap.put("3","Tiga");
		
		System.out.println("Total nilai kunci dalam HasMap sebelum dihapus: "+hMap.size());
		Object obj = hMap.remove("2");
		System.out.println(obj+" terhapus dari HashMap");
		System.out.println("Total nilai kunci dalam HasMap setelah dihapus: "+hMap.size());
		hMap.clear();
		System.out.println("Total nilai kunci dalam HasMap adalah: "+hMap.size());
	}
}