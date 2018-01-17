import java.util.*;

public class ContohSet {
	public static void main(String[] args){
		Set<String> set = new HashSet<>();
		set.add("Asep");
		set.add("Gatot");
		set.add("Zainal");
		set.add("Asep");
		set.add("Dewi");
		System.out.print("Elemen pada HashSet : ");
		System.out.println(set);
		Set<String> sortSet = new TreeSet<>(set);
		System.out.print("Elemen pada TreeSet : ");
		System.out.println(sortSet);
	}
}