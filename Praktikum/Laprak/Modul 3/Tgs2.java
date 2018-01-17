public class Tgs2 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		byte count = 0;
		char[] Matkul = {'p','e','m','r','o','g','r','a','m','a','n',
			'b','e','r','b','a','s','i','s','o','b','j','e','k'};
		
		for(int i=0;i<Matkul.length;i++){
			System.out.print(Matkul[i]);
			if(Matkul[i]=='a') count++;
		}
		System.out.println(" memiliki huruf 'a' sebanyak "+count+" huruf.");
	}
}
		
		
		
		
	