import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Tgs7 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		JFrame frame = new JFrame("Input");

		String kalimat = JOptionPane.showInputDialog(frame,"String kalimat utama: ");
		String cari = JOptionPane.showInputDialog(frame,"String kalimat yang diganti: ");
		String pengganti = JOptionPane.showInputDialog(frame,"String Kalimat pengganti: ");
		System.out.println("String kalimat utama: "+kalimat);
		System.out.println("String kalimat yang diganti: "+cari);
		System.out.println("String kalimat pengganti: "+pengganti);
		kalimat = kalimat.replace(cari, pengganti);
		System.out.println("Kalimat utama menjadi: "+kalimat);
	}
}