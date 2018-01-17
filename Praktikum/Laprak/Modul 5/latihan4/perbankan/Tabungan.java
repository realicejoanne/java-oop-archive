package perbankan;

public class Tabungan {
	protected int saldo;
	public Tabungan(int saldo){
		this.saldo = saldo;
	}
	public int getSaldo(){
		return saldo;
	}
	public void simpanUang(int jumlah){
		saldo+=jumlah;
	}
	public boolean ambilUang(int jumlah){
		saldo-=jumlah;
		if(saldo==0) return true;
		else {
			saldo+=jumlah;
			return false;
		}
	}
}