public class Kurir extends Pegawai {
	public int gaji;
	public Kurir(String nama){
		super(nama);
	}
	public Kurir(String nama, int gaji){
		super(nama);
		this.gaji = gaji;
	}
	public int getGaji(){
		return gaji;
	}
}