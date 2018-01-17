import java.util.*;

public class Tgs1 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		List<String> warna = new ArrayList<String>();
		List<String> warnaDihapus = new ArrayList<String>();
		warna.add("MAGENTA");
		warna.add("RED");
		warna.add("WHITE");
		warna.add("BLUE");
		warna.add("CYAN");
		warnaDihapus.add("RED");
		warnaDihapus.add("WHITE");
		warnaDihapus.add("BLUE");

		System.out.println("\nWarna:");
		System.out.println(warna);
		System.out.println("\nWarna yand dihapus:");
		System.out.println(warnaDihapus);
		warna.removeAll(warnaDihapus);
		System.out.println("\nOutput:");
		System.out.println(warna);
	}
}
