import java.text.NumberFormat;

public class Lat1 {
	public static void main(String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(3);
		
		int nilai[][] = new int[4][3];
		nilai[0][0] = 81;
		nilai[0][1] = 90;
		nilai[0][2] = 62;
		nilai[1][0] = 50;
		nilai[1][1] = 83;
		nilai[1][2] = 87;
		nilai[2][0] = 89;
		nilai[2][1] = 55;
		nilai[2][2] = 65;
		nilai[3][0] = 77;
		nilai[3][1] = 70;
		nilai[3][2] = 92;
		
		String NRP[] = {"1", "2", "3", "4"};
		String Mhs[] = {"Ahmad", "Adang", "Dani", "Edi"};
		double rata[] = new double[nilai.length];
		for(int i=0;i<nilai.length;i++){
			for(int j=0;j<nilai[0].length;j++){
				rata[i]+=nilai[i][j];
			}
			rata[i]/=nilai[0].length;
		}
		
		System.out.println("Daftar nilai mahasiswa\n");
		System.out.println("NRP\tNama\tRPL\tBD\tPBO\tRata-rata");
		System.out.println("-------------------------------------------------");
		for(int i=0;i<nilai.length;i++){
			System.out.print(NRP[i] + "\t");
			System.out.print(Mhs[i] + "\t");
			for(int j=0;j<nilai[0].length;j++){
				System.out.print(nilai[i][j] + "\t");
			}
			System.out.print(nf.format(rata[i])+"\n");
		}
	}
}