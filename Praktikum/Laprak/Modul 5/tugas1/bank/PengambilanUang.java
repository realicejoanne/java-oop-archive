package bank;

public class PengambilanUang extends Tabungan {
	private int proteksi;
	public PengambilanUang(int saldo){
		super(saldo);
	}
	public PengambilanUang(int saldo, int proteksi){
		super(saldo);
		this.proteksi=proteksi;
	}
	public int getSaldo(){
		return saldo;
	}
	public boolean ambilUang(int jumlah){
		int temp=saldo;
		saldo-=jumlah;
		if(saldo<proteksi){
			saldo=temp;
			return false;
		}
		else return true;
	}
}
