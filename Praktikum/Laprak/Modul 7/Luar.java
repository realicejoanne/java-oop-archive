public class Luar {
	private String variabelLuar = "Variabel Luar";
	class Dalam {
		String variabelDalam = "Variabel Dalam";
		public void bicara(){
			System.out.println(variabelDalam);
			System.out.println(variabelLuar);
		}
	}
}