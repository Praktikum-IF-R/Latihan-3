
import java.util.Scanner;

public class MainOverLoad {

    public static void main(String[] args) {
        Scanner nuel = new Scanner(System.in);

        OverLoad test = new OverLoad();
        System.out.println("Luas Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        int a = nuel.nextInt();
        System.out.print("Masukkan Lebar : ");
        int b = nuel.nextInt();
        System.out.println("Luas Persegi Panjang : " + test.getLuas(a, b));
        System.out.println("========================================");
        System.out.println("");
        System.out.println("Luas Jajar Genjang");
        System.out.print("Masukkan Sisi Atas : ");
        int sisia = nuel.nextInt();
        System.out.print("Masukkan Sisi Bawah :");
        int sisia2 = nuel.nextInt();
        System.out.print("Masukkan Tinggi : ");
        int tinggi = nuel.nextInt();
        System.out.println("Luas Jajar Genjang : " + test.getLuas(sisia, sisia2, tinggi));
        System.out.println("");
        System.out.println("==========================================");
        System.out.println("Hint : " + (test.getLuas(a, b) + test.getLuas(sisia, sisia2, tinggi)));
    }

}
