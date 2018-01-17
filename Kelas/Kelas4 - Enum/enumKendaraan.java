public enum enumKendaraan {
    A("Kapal"),B("Motor"),C("Pesawat"), D("Mobil");
    String ken;
    
    private enumKendaraan(String kendaraan){
		this.ken = kendaraan;
    }
    public String getEnum(){
		return ken;
    }
}