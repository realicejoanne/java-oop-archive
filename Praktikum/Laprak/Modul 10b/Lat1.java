import java.util.*;

public class Lat1 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		Scanner in = new Scanner(System.in);
		
		Map<String, Integer> barang = new TreeMap<String, Integer>();
		System.out.print("Input : ");
		String str = in.nextLine();
		String[] splitted = str.split(" ");
		
		for(String kata : splitted){
			Integer n = barang.get(kata);
			if(n == null)
				n = 0;
			barang.put(kata, n+1);
		}
		
		Set<String> key = barang.keySet();
		System.out.print("Output: ");
		
		for(Iterator<String> it = key.iterator(); it.hasNext();){
			String key1 = it.next();
			System.out.print(key1+" = "+barang.get(key1)+" ");
		}
	}
}
