class Manusia{
	//diprivate
	private int jmlTangan=2;
	private int jmlKaki=2;
	
	//nama konstruktor harus sama dengan nama class
	Manusia(){
		this.jmlTangan=2;
		this.jmlKaki=2;
	}
	Manusia(int jmlTangan, int jmlKaki){
		this.jmlTangan=jmlTangan;
		this.jmlKaki=jmlKaki;
	}
	
	//set (void)
	void setjmlTangan(int jmlTangan){
		this.jmlTangan=jmlTangan;
	}
	void setjmlKaki(int jmlKaki){
		this.jmlKaki=jmlKaki;
	}
	
	//get (non void)
	int getjmlTangan(){
		return this.jmlTangan;
	}
	int getjmlKaki(){
		return this.jmlKaki;
	}
	
	public static void main(String args[]){
		//instansiasi
		Manusia mns = new Manusia();
		System.out.println("^^Tanpa parameter^^\n");
		System.out.println("Jumlah tangan: "+mns.jmlTangan);
		System.out.println("Jumlah kaki: "+mns.jmlKaki);
		
		Manusia mns1 = new Manusia(50,20);
		System.out.println("^^\nPanggil konstruktor dengan 2 parameter input^^\n");
		System.out.println("Jumlah tangan: "+mns1.jmlTangan);
		System.out.println("Jumlah kaki: "+mns1.jmlKaki);
	}
}