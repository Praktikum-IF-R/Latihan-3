package bangunmain;

import java.util.Scanner;

public class BangunMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bangun Luas = new Bangun();
        System.out.print("Masukan Panjang Persegi           : ");
        int p = in.nextInt();
        System.out.print("Masukan Lebar Persegi             : ");
        int l = in.nextInt();
        System.out.print("Masukan Sisi Bawah Trapesium      : ");
        int sb = in.nextInt();
        System.out.print("Masukan Sisi Atas Trapesium       : ");
        int sa = in.nextInt();
        System.out.print("Masukan Tinggi Trapesium          : ");
        int t = in.nextInt();
        double a = Luas.getLuas(p, l);
        double b = Luas.getLuas(sb, t, sa);
        System.out.println("Luas Persegi                    : " + a);
        System.out.println("Luas Trapesium                  : " + b);
        System.out.println("jumlah                          : " +( Luas.getLuas(p, l) + Luas.getLuas(sb, t, sa)));

    }

}
