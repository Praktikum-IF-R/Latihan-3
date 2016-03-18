package latihan2;

import java.util.Scanner;

public class mainpersegipanjang {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        luas coba1 = new luas();
        System.out.println("=======data untuk persegi panjang=======");
        System.out.print("masukkan ukuran panjang : " );
        double panjang = c.nextDouble();
        c.nextLine();
        System.out.print("masukkan ukuran lebar   : ");
        double lebar = c.nextDouble();
        coba1.getluas(panjang, lebar);

        luas coba2 = new luas();
        System.out.println("=============data trapesium=============");
        System.out.print("masukkan ukuran atas    : ");
        double atas = c.nextDouble();
        c.nextLine();
        System.out.print("masukkan ukuran bawah   : ");
        double bawah = c.nextDouble();
        System.out.print("masukkan ukuran tinggi  : ");
        double tinggi = c.nextDouble();
        coba2.getluas(atas, bawah, tinggi);

        double total = (coba1.getluas(panjang, lebar)) + (coba2.getluas(atas, bawah, tinggi));

        System.out.println("luas persegi panjang \t: "+ coba1.getluas(panjang, lebar)+"cm");
        System.out.println("luas trapesium          : "  + coba2.getluas(atas, bawah, tinggi)+"cm");
        System.out.println("jumlah luas kedua nya \t: "+ total+"cm");

    }
}
