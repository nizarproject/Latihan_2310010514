package hitung;

public class Matematika {
    private double bil1, bil2;
    
    public Matematika(double bil1, double bil2){
        this.bil1 = bil1;
        this.bil2 = bil2;
    }
    
    // Method setPenjumlahan
    public double setPenjumlahan(){
        return bil1 + bil2;
    }
    
    // Method setPengurangan
    public double setPengurangan(){
        return bil1 - bil2;
    }
    
    // Method setPerkalian
    public double setPerkalian(){
        return bil1 * bil2;
    }
    
    // Method setPembagian
    public double setPembagian(){
        return bil1 / bil2;
    }
}
