import java.util.*;

public class Tugas1 {
	public static void main(String[] args){
		System.out.println("Patricia Joanne 140810160065");
		TreeMap<String,String> provinsi_ibukota = new TreeMap<String,String>();
		
		provinsi_ibukota.put("Nanggroe Aceh Darussalam", "Banda Aceh");
		provinsi_ibukota.put("Sumatera Utara", "Medan");
		provinsi_ibukota.put("Sumatera Barat", "Padang");
		provinsi_ibukota.put("Riau", "Pekanbaru");
		provinsi_ibukota.put("Kepulauan Riau", "Tanjung Pinang");
		provinsi_ibukota.put("Jambi", "Jambi");
		provinsi_ibukota.put("Bengkulu", "Bengkulu");
		provinsi_ibukota.put("Bangka Belitung", "Pangkal Pinang");
		provinsi_ibukota.put("Lampung", "Bandar Lampung");
		provinsi_ibukota.put("Sumatera Selatan", "Palembang");
		provinsi_ibukota.put("Banten", "Serang");
		provinsi_ibukota.put("DKI Jakarta", "Jakarta");
		provinsi_ibukota.put("Jawa Barat", "Bandung");
		provinsi_ibukota.put("Jawa Tengah", "Semarang");
		provinsi_ibukota.put("DI Yogyakarta", "Yogyakarta");
		provinsi_ibukota.put("Jawa Timur", "Surabaya");
		provinsi_ibukota.put("Kalimantan Barat", "Pontianak");
		provinsi_ibukota.put("Kalimantan Tengah", "Palangkaraya");
		provinsi_ibukota.put("Kalimantan Selatan", "Banjarmasin");
		provinsi_ibukota.put("Kalimantan Timur", "Samarinda");
		provinsi_ibukota.put("Kalimantan Utara", "Tanjung Selor");
		provinsi_ibukota.put("Sulawesi Utara", "Manado");
		provinsi_ibukota.put("Sulawesi Tengah", "Palu");
		provinsi_ibukota.put("Sulawesi Selatan", "Makassar");
		provinsi_ibukota.put("Sulawesi Tenggara", "Kendari");
		provinsi_ibukota.put("Sulawesi Barat", "Mamuju");
		provinsi_ibukota.put("Gorontalo", "Gorontalo");
		provinsi_ibukota.put("Maluku", "Ambon");
		provinsi_ibukota.put("Maluku Utara", "Sofifi");
		provinsi_ibukota.put("Papua", "Jayapura");
		provinsi_ibukota.put("Papua Barat", "Manokwari");

		TreeSet<String> sumatera = new TreeSet<String>();
		sumatera.add("Nanggroe Aceh Darussalam");
		sumatera.add("Sumatera Utara");
		sumatera.add("Sumatera Barat");
		sumatera.add("Riau");
		sumatera.add("Kepulauan Riau");
		sumatera.add("Jambi");
		sumatera.add("Bengkulu");
		sumatera.add("Bangka Belitung");
		sumatera.add("Sumatera Selatan");
		sumatera.add("Lampung");
		
		TreeSet<String> jawa = new TreeSet<String>();
		jawa.add("Banten");
		jawa.add("DKI Jakarta");
		jawa.add("Jawa Barat");
		jawa.add("Jawa Tengah");
		jawa.add("DI Yogyakarta");
		jawa.add("Jawa Timur");

		TreeSet<String> kalimantan = new TreeSet<String>();
		kalimantan.add("Kalimantan Barat");
		kalimantan.add("Kalimantan Tengah");
		kalimantan.add("Kalimantan Timur");
		kalimantan.add("Kalimantan Utara");
		kalimantan.add("Kalimantan Selatan");

		TreeSet<String> sulawesi = new TreeSet<String>();
		sulawesi.add("Sulawesi Barat");
		sulawesi.add("Sulawesi Tengah");
		sulawesi.add("Sulawesi Tenggara");
		sulawesi.add("Sulawesi Utara");
		sulawesi.add("Sulawesi Selatan");
		sulawesi.add("Gorontalo");

		TreeSet<String> maluku = new TreeSet<String>();
		maluku.add("Maluku");
		maluku.add("Maluku Utara");

		TreeSet<String> papua = new TreeSet<String>();
		papua.add("Papua");
		papua.add("Papua Barat");

		TreeMap<String, TreeSet<String>> pulau_provinsi = new TreeMap<String, TreeSet<String>>();
		pulau_provinsi.put("Sumatera", sumatera);
		pulau_provinsi.put("Jawa", jawa);
		pulau_provinsi.put("Kalimantan", kalimantan);
		pulau_provinsi.put("Sulawesi", sulawesi);
		pulau_provinsi.put("Maluku", maluku);
		pulau_provinsi.put("Papua", papua);

		Set<String> key_set = pulau_provinsi.keySet();
		System.out.println("\nIbukota provinsi yang terdapat di Pulau Sumatera: ");
		for(Iterator<String> it = key_set.iterator(); it.hasNext();){
			String currentKey = it.next();
			if(currentKey == "Sumatera"){
				for(String str : pulau_provinsi.get(currentKey))
					System.out.println(" - "+provinsi_ibukota.get(str));
				break;
			}
		}

		System.out.println("\nIbukota provinsi yang terdapat di Pulau Jawa: ");
		for(Iterator<String> it = key_set.iterator(); it.hasNext();){
			String currentKey = it.next();
			if(currentKey == "Jawa"){
				for(String str : pulau_provinsi.get(currentKey))
					System.out.println(" - "+provinsi_ibukota.get(str));
				break;
			}
		}

		System.out.println("\nProvinsi yang berawalan 'S': ");
		for(Iterator<String> it = key_set.iterator(); it.hasNext();){
			String currentKey = it.next();
			for(String str : pulau_provinsi.get(currentKey)){
				if(str.charAt(0) == 'S') System.out.println(" - "+str);
			}
		}
	}
}
