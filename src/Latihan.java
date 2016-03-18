package Praktik03;
public class Latihan {
    private double panjang;
    private double lebar;
    private double tinggi;
    private double luas1;
    private double luas2;
    
    public Latihan(){
        panjang = 0;
        lebar = 0;
        tinggi = 0;
    }
    double getLuas(double a, double b){
        panjang = a;
        lebar = b;
        luas1 = panjang*lebar;
        return luas1;
    }
    double getLuas(double a, double b, double c){
        panjang = a;
        lebar = b;
        tinggi = c;
        luas2 = ((panjang+lebar)*tinggi)/2;
        return luas2;
    }
}