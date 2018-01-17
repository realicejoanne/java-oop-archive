import java.util.*;

class Latihan{
	public static void main(String[]args){
		//Set : Hashset,LinkedHasSet, TreeSet
		TreeSet<String> nama = new TreeSet<String>();
		
		nama.add("Hilman");nama.add("indy");nama.add("Fauzi");
		
		Iterator<String> iterator = nama.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next() + " ");
		}
	}
}
