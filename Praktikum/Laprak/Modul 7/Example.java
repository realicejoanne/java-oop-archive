class Example {
	public static void main(String[] args){
		Short s = 15;
		Boolean b;
		b = (s instanceof Short);
		System.out.println(b);
		b = (s instanceof Number);
		System.out.println(b);
	}
}
