public class Manajer extends Pegawai {
	public int tunjangan;
	public Manajer(String nama){
		super(nama);
	}
	public Manajer(String nama, int tunjangan){
		super(nama);
		this.tunjangan = tunjangan;
	}
	public int getTunjangan(){
		return tunjangan;
	}
}