class TesTumbuhan {
	public static String cariAkar(Tumbuhan tbh){
		String jenisAkar = tbh.getAkar();
		if(tbh instanceof Dikotil) jenisAkar = "Tunggang";
			else jenisAkar = "Serabut";
		return jenisAkar;
	}
	
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065\n");
		Monokotil q1 = new Monokotil(20, "Kelapa");
		Dikotil q2 = new Dikotil(12, "Apel", true);
		System.out.println("Objek \t| Tinggi | Nama \t| Kambium | Akar");
		System.out.println("------------------------------------------------------");
		System.out.print("O1 \t| " + q1.getTinggi() + " \t | " + q1.getNama() + " \t| -----   | ");
		System.out.println(cariAkar(q1));
		System.out.print("O2 \t| " + q2.getTinggi() + " \t | " + q2.getNama() + " \t| "+ q2.getKambium() +"    | ");
		System.out.println(cariAkar(q2));
	}
}