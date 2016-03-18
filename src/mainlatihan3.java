package latihan3;
import java.util.Scanner;
public class mainlatihan3 {
    public static void main(String[] args) {
        Scanner nilai = new Scanner (System.in);
        int jumlah;
        Latihan3 l1 = new Latihan3();
        Latihan3 l2 = new Latihan3();
        System.out.print("Masukkan panjang persegi panjang: ");
        int pa = nilai.nextInt();
        System.out.print("Masukkan lebar persegi panjang: ");
        int le = nilai.nextInt();
        System.out.print("Masukkan alas trapesium 1: ");
        int al1 = nilai.nextInt();
        System.out.print("Masukkan alas trapesium 2: ");
        int al2 = nilai.nextInt();
        System.out.print("Masukkan tinggi trapesium :");
        int ti = nilai.nextInt();
        System.out.println("Luas persegi panjang: "+l1.getluas2(pa,le));
        System.out.println("Luas trapesium: "+l2.getluas1(al1,al2,ti));
        jumlah = (l1.getluas2(pa,le)+l2.getluas1(al1,al2,ti));
        System.out.println("Jumlah: "+jumlah);
        
    }
    
}
