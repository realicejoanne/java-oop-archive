import java.util.*;

public class Lat2 {
	public static void main(String[] args){
	System.out.println("Patricia Joanne 140810160065");
		List<String> l = new ArrayList<>();
		l.add("ayah");
		l.add("ibu");
		l.add("kakak");
		l.add("adik");
		
		System.out.print("Menampilkan isi List: ");
		for(Object object : l){
			String element = (String) object;
			System.out.print(element+" ");
		}
		
		Collections.reverse(l);
		System.out.print("\nMembalikkan isi List: " +l);	
		Collections.shuffle(l);
		System.out.print("\nMengacak isi List: " +l);
		Collections.sort(l);
		System.out.print("\nMengurutkan isi List: " +l);
	}
}
