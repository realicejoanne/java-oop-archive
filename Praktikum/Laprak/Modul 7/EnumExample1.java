public class EnumExample1 {
	public static void main(String[] args){
		OperatingSystems os;
		os = OperatingSystems.Windows;
		switch(os){
			case Windows : System.out.println("You choose Windows!");
				break;
			case Unix : System.out.println("You choose Unix!");
				break;
			case Linux : System.out.println("You choose Linux!");
				break;
			case Macintosh : System.out.println("You choose Macintosh!");
				break;
			default : System.out.println("I don't know your OS.");
				break;
		}
	}
}