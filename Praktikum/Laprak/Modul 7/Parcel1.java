public class Parcel1 {
	public Tujuan ke(String s){
		class Tujuannya implements Tujuan {
			private String label;
			
			Tujuannya(String tuj){
				label = tuj;
			}
			
			public String bacaLabel(){
				return label;
			}
		}
		return new Tujuannya(s);
	}
	public static void main(String args[]){
		Parcel1 p1 = new Parcel1();
		Tujuan t = p1.ke("Bali");
		System.out.println(t.bacaLabel());
	}
}

interface Tujuan {
	String bacaLabel();
}