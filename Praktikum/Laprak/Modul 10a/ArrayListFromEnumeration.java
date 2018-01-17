import java.util.*;
import java.util.Vector;
import java.util.Enumeration;

public class ArrayListFromEnumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("A");
		v.add("B");
		v.add("D");
		v.add("E");
		v.add("F");
		System.out.println("Vector contains: " +v);
		Enumeration e = v.elements();
		ArrayList aList = Collections.list(e);
		System.out.println("Arraylist contains: " +aList);
	}
}