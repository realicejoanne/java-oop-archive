class Outer {
	static String test;
	String str = "Outer class field";

	Outer(){
		new Inner();
	}
	class Inner {
		static final String str = "Constant is ok";
		Inner(){
			System.out.println(Outer.this.str);
			test = "Inherits static member";
			System.out.println(test);
		}
	}
}