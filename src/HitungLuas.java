
package hitungluas;

import java.util.Scanner;

public class HitungLuas {
    
    public static int luas (int p, int l){
        int luas = p*l;
        return luas;
    }
    public static double luas (double s1, double s2, double t){
        double luas = (s1+s2)*t/2;
        return luas;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan panjang : ");
        int panjang = in.nextInt();
        System.out.print("Masukkan lebar : " );
        int lebar = in.nextInt();
        System.out.println("Luas Persegi Panjang adalah : "+luas(panjang, lebar));
        System.out.print("Masukkan sisi 1 : ");
        int sisi1 = in.nextInt();
        System.out.print("Masukkn sisi 2 : ");
        int sisi2 = in.nextInt();
        System.out.print("Masukkan tinggi : ");
        int tinggi = in.nextInt();
        System.out.println("Luas Trapesium adalah : "+luas(sisi1, sisi2, tinggi));
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Luas Persegi Panjang dan Trapesium adalah : "+(luas(panjang, lebar)+luas(sisi1, sisi2, tinggi)));
    }

    
}
