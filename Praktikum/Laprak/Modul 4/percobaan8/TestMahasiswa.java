import sekolah.*;

public class TestMahasiswa{
	public static void main(String[] args) {
		System.out.println("Patricia Joanne 140810160065");
		Kelas kelas = new Kelas(1, "TI");
		kelas.setMhs(new Mahasiswa(65, "Patricia Joanne"));
		kelas.cetakMhs();
	}
}