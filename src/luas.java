package latihaan;
import java.util.Scanner;
public class luas {
public static double getArea (double panjang, double lebar){
    double hasil = panjang * lebar;
    return hasil;
}
public static double getArea (double tinggi, double sisi1, double sisi2){
    double hasil = ((tinggi * (sisi1+sisi2))/2);
    return hasil;
}
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Panjang persegi panjang : ");
        double p = input.nextDouble();
        System.out.print("Lebar persegi panjang : ");
        double l = input.nextDouble();
        System.out.println("==============================");
        System.out.print("Tinggi trapesium : ");
        double t = input.nextDouble();
        System.out.print("Sisi 1 trapesium : ");
        double s1 = input.nextDouble();
        System.out.print("Sisi 2 trapesium : ");
        double s2 = input.nextDouble();
        System.out.println("==============================");
        System.out.println("Luas persegi panjang " + getArea(p,l));
        System.out.println("Luas trapesium " + getArea(t,s1,s2));
        System.out.println("Total luas keduanya " + (getArea(p,l)+getArea(t,s1,s2)));  
    }
}