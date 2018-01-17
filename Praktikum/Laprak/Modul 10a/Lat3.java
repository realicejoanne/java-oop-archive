import java.util.*;

class Mahasiswa implements Comparable<Mahasiswa>{
	protected String nrp;
	protected String nama;
	
	Mahasiswa(String nrp, String nama){
		this.nrp = nrp;
		this.nama = nama;
	}
	void setNrp(String nrp){
		this.nrp = nrp;
	}
	void setNama(String nama){
		this.nama = nama;
	}
	String getNrp(){
		return this.nrp;
	}
	String getNama(){
		return this.nama;
	}
	public String toString(){
		return "("+this.nrp+") "+this.nama;
	}
	public int compareTo(Mahasiswa mhs){
		return nrp.compareTo(mhs.getNrp());
	}
}

public class Lat3 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		List<Mahasiswa> l = new ArrayList<>();
		Mahasiswa mhs1 = new Mahasiswa("01", "Andi");
		l.add(mhs1);
		Mahasiswa mhs2 = new Mahasiswa("11", "Beni");
		l.add(mhs2);
		Mahasiswa mhs3 = new Mahasiswa("21", "Coki");
		l.add(mhs3);
		Mahasiswa mhs4 = new Mahasiswa("31", "Deni");
		l.add(mhs4);

		System.out.print("Menampilkan isi List: [ ");
		Iterator<Mahasiswa> it = l.iterator();
		while(it.hasNext()){
			Mahasiswa mhs = it.next();
			System.out.print("("+mhs.getNrp()+") "+mhs.getNama()+" ");
		}
		System.out.print("]");
		
		Collections.reverse(l);
		System.out.print("\nMembalikkan isi List: " +l);
		
		Collections.shuffle(l);
		System.out.print("\nMengacak isi List: " +l);
		
		Collections.sort(l);
		System.out.print("\nMengurut isi List: " +l);
	}
}
