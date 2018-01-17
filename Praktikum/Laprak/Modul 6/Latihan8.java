class Latihan8 {
	public static void Proses(Pegawai peg){
		if(peg instanceof Manajer){
			Manajer man = (Manajer) peg;
			System.out.println("Nama manajer: "+man.nama);
			System.out.println("Tunjangan: "+man.tunjangan);
		}
		else if(peg instanceof Kurir){
			Kurir kur = (Kurir) peg;
			System.out.println("Nama kurir: "+kur.nama);
			System.out.println("Gaji: "+kur.gaji);
		}
	}
	
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		Manajer peg1 = new Manajer("Emma Watson",90000);
		Proses(peg1);
		Kurir peg2 = new Kurir("Emma Stone",60000);
		Proses(peg2);
	}
}