import java.util.*;

public class ContohList {
	public static void main(String[] args){
		List<String> list = new ArrayList<>();
		list.add("Jakarta");
		list.add("Bekasi");
		list.add("Bandung");
		list.add("Aceh");
		list.add("Yogya");
		
		System.out.println(list);
		System.out.println("3 : "+list.get(3));
		System.out.println("1 : "+list.get(1));
		
		LinkedList<String> queue = new LinkedList<>();
		queue.addFirst("Jakarta");
		queue.addFirst("Bekasi");
		queue.addFirst("Bandung");
		queue.addFirst("Aceh");
		queue.addFirst("Yogya");
		System.out.println(queue);
		
		queue.removeLast();
		queue.removeLast();
		System.out.println(queue);
	}
}