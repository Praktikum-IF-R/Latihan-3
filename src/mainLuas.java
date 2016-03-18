
import java.util.Scanner;

public class mainLuas {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Luas obj1 = new Luas();
        System.out.println("Input data untuk persegi panjang");
        System.out.print("Masukkan panjang : ");
        double panjang = s.nextDouble();
        s.nextLine();
        System.out.print("Masukkan lebar : ");
        double lebar = s.nextDouble();
        obj1.getLuas(panjang, lebar);

        Luas obj2 = new Luas();
        System.out.println("Input data untuk trapesium");
        System.out.print("Masukkan sisi atas : ");
        double atas = s.nextDouble();
        s.nextLine();
        System.out.print("Masukkan sisi bawah : ");
        double bawah = s.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = s.nextDouble();
        obj2.getLuas(atas, bawah, tinggi);

        double sumLuas = obj1.getLuas(panjang, lebar) + obj2.getLuas(atas, bawah, tinggi);

        System.out.println("Luas persegi panjang : " + obj1.getLuas(panjang, lebar));
        System.out.println("Luas trapesium : " + obj2.getLuas(atas, bawah, tinggi));
        System.out.println("Jumlah luas keduanya : " + sumLuas);

    }
}
