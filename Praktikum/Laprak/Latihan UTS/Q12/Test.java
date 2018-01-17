public class Test {
	public static void main(String[] args){
		String[] words = new String[] ("aaa", "bbb", "ccc", "ddd");
		Map<String, Integer> m = new TreeMap<String, Integer>();
		for(String word: words){
			freq = m.get(word);
			m.put(word, freq == null ? l : freq + 1);
		}
		System.out.println(m);
	}
}