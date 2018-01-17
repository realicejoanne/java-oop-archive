import java.util.Scanner;

public class Lat2 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		Scanner show = new Scanner(System.in);
		System.out.print("Masukkan jumlah deret Fibonacci: ");
		int n = show.nextInt();
		long fib[] = new long[n+1];
		fib[1] = 1;
		
		for(int i=2;i<n+1;i++){
			fib[i] = fib[i-1] + fib[i-2];
		}
		System.out.print("0 ");
		for(int i=1;i<=n-1;i++){
			System.out.print(fib[i]+" ");
		}
	}
}