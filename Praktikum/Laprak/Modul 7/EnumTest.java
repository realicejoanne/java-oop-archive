class EnumTest {
	enum Size { small, medium, large, Xlarge };
	
	public static void main(String[] args){
		for(Size s : Size.values()){
			if (s == Size.small) System.out.print("Small ");
			else if (Size.medium.equals(s))
				System.out.print("medium ");
			else if (s == Size.large)
				System.out.print("large ");
			else if (s.equals("Xlarge "))
				System.out.println("Xlarge ");
			else if (s == Size.Xlarge)
				System.out.println("Xlarge");
		}
	}
}
