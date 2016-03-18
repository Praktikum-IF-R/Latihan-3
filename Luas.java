package Tugas3;

/**
 *
 * @author Wahyu Ridiansyah
 */
import java.util.Scanner;

public class Luas {

    public static int getLuas(int a, int b) {
        int hasil = a * b;
        return hasil;
    }

    public static int getLuas(int a, int b, int c) {
        int sejajar = b + c;
        int hasil = a * sejajar / 2;
        return hasil;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("----------Persegi Panjang----------");
        System.out.print("Input Nilai Panjang: ");
        int panjang = in.nextInt();
        System.out.print("Input Nilai Lebar: ");
        int lebar = in.nextInt();
        System.out.println("Luas Persegi Panjang = " + Luas.getLuas(panjang, lebar));
        System.out.println("-------------Trapesium-------------");
        System.out.print("Input Nilai Sisi Sejajar A: ");
        int sejajarA = in.nextInt();
        System.out.print("Input Nilai Sisi Sejajar B: ");
        int sejajarB = in.nextInt();
        System.out.print("Input Nilai Tinggi: ");
        int tinggi = in.nextInt();
        System.out.println("Luas Trapesium = " + Luas.getLuas(sejajarA, sejajarB, tinggi));
        System.out.println("-----------------------------------");
        int luas = Luas.getLuas(panjang, lebar) + Luas.getLuas(sejajarA, sejajarB, tinggi);
        System.out.println("Jumlah Luas Keduanya = " + luas);
        System.out.println("-----------------------------------");

    }

}
