public class enumMain {
    public static void main(String[] args){
        enumMain en = new enumMain();
        for (enumKendaraan enKen : enumKendaraan.values()){
            System.out.println("Nama Kendaraan: "+enKen.getEnum());
        }
    }
}