package Praktik03;
import java.util.Scanner;
public class MainLatihan {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Latihan re = new Latihan();
        System.out.print("Set Panjang Persegi = ");
        double a = in.nextInt();
        System.out.print("Set Lebar Persegi = ");
        double b = in.nextInt();
        System.out.print("Set Sisi Sejajar 1 Trapesium = ");
        double c = in.nextInt();
        System.out.print("Set Sisi Sejajar 2 Trapesium = ");
        double d = in.nextInt();
        System.out.print("Set Tinggi Trapesium = ");
        double e = in.nextInt();
        double total = re.getLuas(a,b)+re.getLuas(c, d, e);
        System.out.println("Luas Persegi Panjang = "+re.getLuas(a,b));
        System.out.println("Luas Trapesium = "+re.getLuas(c, d, e));
        System.out.println("Luas Dua Bangun = "+total);
    }
}