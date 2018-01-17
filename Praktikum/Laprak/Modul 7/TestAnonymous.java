class TestAnonymous {
	public static void main(String str[]) {
		final int d = 10;
		father f = new father(d);
		father fanon = new father (d){
			void method(int x){
				System.out.println("Anonymous: "+x);
			}
			void method(String str){
				System.out.println("Anonymous: "+str);
			}
			void newMethod(){
				System.out.println("New method in Anonymous: ");
			}
		};
	}
}