package transportasi;

public class Kendaraan{
	protected int jmlRoda;
	protected String warna;
	
	public void setJmlRoda(int roda){
		jmlRoda=roda;
	}
	public int getJmlRoda(){
		return jmlRoda;
	}
	public void setWarna(String warna){
		this.warna=warna;
	}
	public String getWarna(){
		return warna;
	}
}
