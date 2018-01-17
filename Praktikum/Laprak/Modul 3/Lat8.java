public class Lat8 {
	public static void main(String argv[]){
		System.out.println("Patricia Joanne 140810160065");
		Lat8 e = new Lat8();
	}
	Lat8(){
		String s = "Java";
		String s2 = "java";
		
		if(s.equalsIgnoreCase(s2)){
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}