package overloading;
import java.util.Scanner;
public class mainTugasLuas {
    public static void HitungLuasP(int p, int l){
        int nilai = p*l;
        System.out.println("Luas Persegi Panjang: "+nilai);
    }
    public static void HitungLuasT(int a, int b, int t){
        int nilai = ((a+b)*t)/2;
        System.out.println("Luas Trapesium: "+nilai);
    }
    public static void main(String[] args) {
        Scanner i = new Scanner (System.in);
        tugasLuas A = new tugasLuas();
        System.out.print("Masukkan panjang: ");
        int p = i.nextInt();
        System.out.print("Masukkan lebar: ");
        int l = i.nextInt();
        HitungLuasP(p,l);
        A.getLuas(p, l);
        System.out.println("======================");
        System.out.print("Masukkan sisi atas: ");
        int a = i.nextInt();
        System.out.print("Masukkan sisi bawah: ");
        int b = i.nextInt();
        System.out.print("Masukkan tinggi: ");
        int t = i.nextInt();
        HitungLuasT(a,b,t);
        A.getLuas(a, b, t);
        System.out.println("======================");
        double jumlah;
        jumlah = A.getLuas(p, l) + A.getLuas(a, b, t);
        System.out.println("Total luas kedua bangun adalah "+jumlah);
    }
    
}
