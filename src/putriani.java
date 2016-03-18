package latihanharian;

import java.util.*;

public class putriani {

    Scanner in = new Scanner(System.in);
    static int panjang, lebar, luasPer;
    static double alas, tinggi, atap;

    public static void main(String[] args) {
        putriani persegi = new putriani();
        System.out.println("persegi");
        persegi.setPanjang();
        persegi.setLebar();  
        putriani trapesium = new putriani();
        System.out.println("trapesium");
        trapesium.setAlas();
        trapesium.setAtap();
        trapesium.setTinggi();
        perhitungan(persegi.hitungLuas(panjang, lebar), trapesium.hitungLuas(alas, atap, tinggi));
        

    }

    void setPanjang() {
        System.out.println("masukkan panjang : ");
        panjang = in.nextInt();
    }

    void setLebar() {
        System.out.println("masukkan lebar : ");
        lebar = in.nextInt();
    }

    void setAlas() {
        System.out.println("masukkan alas : ");
        alas = in.nextDouble();
    }

    void setAtap() {
        System.out.println("masukkan atap : ");
        atap = in.nextDouble();
    }

    void setTinggi() {
        System.out.println("masukkan tinggi : ");
        tinggi = in.nextDouble();
    }

    int hitungLuas(int panjang, int lebar) {
        int luas = panjang * lebar;
        return luas;
    }

    double hitungLuas(double alas, double atap, double tinggi) {
        double luas = (alas + atap) * tinggi * 0.5;
        return luas;
    }

    static void perhitungan(int a, double a1) {
        System.out.println("jumlah semuanya adalah : "+(a+a1));
    }
}
