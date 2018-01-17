public class Truk {
	private double muatan;
	private double muatanmaks;

	public Truk(double beratmaks) {
		muatanmaks = beratmaks;
		muatan=0;
	}
	public double getMuatan() {
		return muatan;
	}
	public double getMuatanMaks() {
		return muatanmaks;
	}
	public boolean tambahMuatan(double berat) {
		double temp = muatan + berat;
		if(temp > muatanmaks){
		 	return false;
		}
		else {
			muatan = muatan+berat;
		 	return true;
		}
	}
}
