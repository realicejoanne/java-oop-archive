import java.util.*;

public class Lat2 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		String str, currentKey;
		Scanner in = new Scanner(System.in);
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		System.out.print("\nInput: ");
		str = in.nextLine();
		String[] splitted = str.split(" ");

		for(String theString : splitted){
			Integer count = treeMap.get(theString);
			if (count == null) count = 0;
			treeMap.put(theString, count+1);
		}

		Set<String> keySet = treeMap.keySet();
		System.out.print("Output: ");

		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			currentKey = it.next();
			System.out.print(currentKey+" = "+treeMap.get(currentKey)+" ");
		}

		Integer min = Collections.min(treeMap.values());
		System.out.print("\n\nNilai terendah : ");
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			currentKey = it.next(); 
			if(treeMap.get(currentKey) == min){
				System.out.println(currentKey+" = "+treeMap.get(currentKey));
				break;
			}
		}

		Integer max = Collections.max(treeMap.values());
		System.out.print("Nilai tertinggi: ");
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			currentKey = it.next(); 
			if(treeMap.get(currentKey) == max){
				System.out.println(currentKey+" = "+treeMap.get(currentKey));
				break;
			}
		}

		System.out.print("\nKey dengan awalan 'm': ");
		for(Iterator<String> it = keySet.iterator();it.hasNext();){
			currentKey = it.next(); 
			if(currentKey.charAt(0) == 'm')
				System.out.print(currentKey+" = "+treeMap.get(currentKey)+" ");
		}		
	}
}
