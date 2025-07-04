package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        //membuat objek
        Matematika nizar = new Matematika(1,4);
        
        System.out.println("Hasil Penjumlahan: "+nizar.setPenjumlahan());
        System.out.println("Hasil Pengurangan: "+nizar.setPengurangan());
        System.out.println("Hasil Perkalian: "+nizar.setPerkalian());
        System.out.println("Hasil Pembagian: "+nizar.setPembagian());
        
    }
    
}
