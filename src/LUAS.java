package luas;

import java.util.Scanner;

public class LUAS {

    public static double Luaspp(double panjang, double lebar) {
        double luaspp = panjang * lebar;
        return luaspp;
    }

    public static double luastrap(double sisi1, double sisi2, double tinggi) {
        double luastrap = (sisi1 + sisi2) * tinggi / 2;
        return luastrap;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double p = 0, l = 0, s1 = 0, s2 = 0, t = 0;
        int pilihan;
        do{
        System.out.println("Program Penghitung Luas Bangunan");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Trapesium");
        System.out.println("3. Jumlah luas Persegi Panjang dan Trapesium");
        System.out.println("Masukkan Pilihan anda :");
        pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukkan panjang Persegi panjang : ");
                p = input.nextDouble();
                System.out.println("Masukkan lebar persegi panjang : ");
                l = input.nextDouble();
                System.out.println("Luas dari persegi panjang tersebut adalah" + Luaspp(p, l));break;
            case 2:
                System.out.println("Masukkan panjang sisi atas :");
                s1 = input.nextDouble();
                System.out.println("Masukkan panjang sisi bawah :");
                s2 = input.nextDouble();
                System.out.println("Masukkan tinggi trapesium");
                t = input.nextDouble();
                System.out.println("Luas dari trapesium tersebut adalah " + luastrap(s1, s2, t));break;
            case 3:
                double JumlahLuas = Luaspp(p, l) + luastrap(s1, s2, t);
                System.out.println("Jumlah kedua luas bangun tersebut adalah :" + JumlahLuas);break;
        }

    }while(pilihan!=4);

}
