class Dikotil extends Tumbuhan {
	boolean kambium;
	public Dikotil(int tinggi, String nama, boolean kambium){
		super(tinggi,nama);
		this.kambium = kambium;
	}
	public boolean getKambium(){
		return kambium;
	}
}