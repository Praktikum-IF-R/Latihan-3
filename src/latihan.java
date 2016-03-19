package BAB3;
import java.util.*;
public class latihan {
    static int panjang;
    static int lebar;
    static double atap, alas, tinggi;
    int luasPersegi;
    double luasTrapesium;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        latihan persegiPanjang = new latihan();
        System.out.println("menghitung persegi");
        persegiPanjang.setPanjang();
        persegiPanjang.setTinggi();
        latihan trapesium = new latihan();
        System.out.println("menghitung trapesium");
        trapesium.setAtap();
        trapesium.setAtap();
        trapesium.setTinggi();
        System.out.println("hasil penjumlahan : "+(persegiPanjang.getLuas(panjang, lebar)+trapesium.getLuas(tinggi, alas, atap)));
    }
    void setPanjang() {
        System.out.println("masukkan panjang : ");
        panjang = in.nextInt();
    }

    void setLebar() {
        System.out.println("masukkan lebar : ");
        lebar = in.nextInt();
    }

    int getLuas(int panjang, int lebar) {
        luasPersegi = panjang * lebar;
        return luasPersegi;
    }

    double getLuas(double tinggi, double alas, double atap) {
        luasTrapesium = 0.5 * (alas + atap) * tinggi;
        return luasTrapesium;
    }

    void setAtap() {
        System.out.println("masukkan panjang atas : ");
        atap = in.nextDouble();
    }

    void setAlas() {
        System.out.println("masukkan panjang alas : ");
        alas = in.nextDouble();
    }

    void setTinggi() {
        System.out.println("masukkan tinggi : ");
        tinggi = in.nextDouble();
    }

}
