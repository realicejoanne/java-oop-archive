import java.util.Scanner;

public class Tgs1 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		
		Scanner in = new Scanner(System.in);
		int [][] arrayOfInts = { {32,87,3,589}, {12,1076,2000,8}, {622,127,77,955} };
		int key;
		
		System.out.print("Enter a number: ");
		key = in.nextInt();
		
		Loop:
		for(byte i=0;i<arrayOfInts.length;i++){
			for(byte j=0;j<arrayOfInts[0].length;j++){
				if(key==arrayOfInts[i][j]){
					System.out.println("Found "+key+" at index ["+i+","+j+"]");
					break Loop;
				}
			}
		}
	}
}