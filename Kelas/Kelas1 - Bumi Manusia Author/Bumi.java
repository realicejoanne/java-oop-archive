class Bumi{
	public static void main (String args[]){
		Manusia mns = new Manusia();
		System.out.println("Jumlah tangan: "+mns.getjmlTangan());
		System.out.println("Jumlah kaki: "+mns.getjmlKaki());
		
		mns.setjmlTangan(0);
		mns.setjmlKaki(4);
		System.out.println("Jumlah tangan: "+mns.getjmlTangan());
		System.out.println("Jumlah kaki: "+mns.getjmlKaki());
	}
}