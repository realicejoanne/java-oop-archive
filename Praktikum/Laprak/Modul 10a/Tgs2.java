import java.util.*;

class Mahasiswa implements Comparable<Mahasiswa>{
	private String Nama;
	private String Nrp;
	private Float Nilai;

	public Mahasiswa(String Nama, String Nrp, Float Nilai){
		this.Nama = Nama;
		this.Nrp = Nrp;
		this.Nilai = Nilai;
	}
	public void setNama(String nama){
		Nama = nama;
	}
	public void setNrp(String nrp){
		Nrp = nrp;
	}
	public void setNilai(Float nilai){
		Nilai = nilai;
	}
	public String getNama(){
		return this.Nama;
	}
	public String getNrp(){
		return this.Nrp;
	}
	public Float getNilai(){
		return this.Nilai;
	}
	
	@Override
	public int compareTo(Mahasiswa mhs){
		return Nilai.compareTo(mhs.getNilai());
	}
}

public class Tgs2 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		List<Mahasiswa> listMhs = new ArrayList<Mahasiswa>();
		String[] nama = {"A","H","G","W","T","Q","B","K"};
		String[] nrp = {"062","001","010","057","029","045","017","032"};
		double nilai;

		for(int i=0;i<nama.length;i++){
			nilai = 60 + (Math.random()*(float)(101-60));
			listMhs.add(new Mahasiswa(nama[i], nrp[i], (float)nilai));
		}
		Collections.sort(listMhs);
		System.out.println(
			"-----------------------\n" +
			"NRP \t Nama \t Nilai" +
			"\n-----------------------"
		);
		for(Iterator<Mahasiswa> it = listMhs.iterator(); it.hasNext();){
			Mahasiswa mhs = it.next();
			System.out.print(mhs.getNama()+" \t "+mhs.getNrp()+" \t ");
			System.out.format("%.1f\n", mhs.getNilai());
		}
		System.out.println("-----------------------");
	}
}
