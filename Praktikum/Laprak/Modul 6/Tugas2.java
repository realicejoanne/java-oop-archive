class Tugas2 {
	public static String cariGerak(Katak kat){
		String gerak = kat.caraBergerak();
		if(kat instanceof Kecebong) gerak = "Berenang";
			else gerak = "Melompat";
		return gerak;
	}
	
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065\n");
		Katak q1 = new Katak(5, "Froggy");
		Kecebong q2 = new Kecebong(2, "Junior Frog", 10);
		System.out.println("Objek \t| Umur \t| Nama \t\t| Ekor \t| caraBergerak");
		System.out.println("------------------------------------------------------");
		System.out.print("O1 \t| " + q1.getUmur() + " \t| " + q1.getNama() + " \t|\t| ");
		System.out.println(cariGerak(q1));
		System.out.print("O2 \t| " + q2.getUmur() + " \t| " + q2.getNama() + " \t| "+ q2.getEkor() +" \t| ");
		System.out.println(cariGerak(q2));
	}
}