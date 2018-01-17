import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
 
public class HashMapDemo{
	public static void main(String[] args){
		Map map = new HashMap();
		 
		map.put("Image", "Select File Image!");
		map.put("Video", "Select File Video!");
		map.put("Audio", "Select File Audio!");
		 
		String mapdesc = (String) map.get("Image");
		System.out.println("Image: " + mapdesc);

		Iterator iterator = map.keySet().iterator();
		while(iterator.hasNext()){
			String key = (String) iterator.next();
			System.out.println("Map: " + key + " sama dengan " + map.get(key));
		}
	}
}
