public class Lat7 {
	public static void main(String argv[]){
		System.out.println("Patricia Joanne 140810160065");
		Lat7 e = new Lat7();
	}
	Lat7(){
		String s1 = new String("Java");
		String s2 = new String ("Java");
		String s3 = new String ("java");
		
		if(s1==s2){
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
		if(s1==s3){
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}
	}
}