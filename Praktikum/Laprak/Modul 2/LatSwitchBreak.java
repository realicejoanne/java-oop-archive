class LatSwitchBreak {
	public static void main (String args[]){
		System.out.println("Patricia Joanne 140810160065");
		
		char hrfAwal = 'a';
		System.out.print("Sebutkan huruf awal hewan kesukaanmu: ");
		try {
			hrfAwal = (char)System.in.read();
		}
		catch (Exception e){
			System.out.println("Error: " + e.toString());
		}
		switch (hrfAwal) {
			case 'a' : System.out.println("Anjing-Anda seorang yang setia!");
				break;
			case 'b' : System.out.println("Beo-Anda peniru ulung!");
				break;
			case 'k' : System.out.println("Kucing-Anda cute deh!");
				break;
			default : System.out.println("Tebak sendiri ya..!");
		}
	}
}