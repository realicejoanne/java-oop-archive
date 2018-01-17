class Fork {
	public static void main(String[] args){
		if (args.length == 1 | args[1].equals("test")){
			System.out.println("Test case");
		}
		else{
			System.out.println("Production " + args[0]);
		}
	}
}