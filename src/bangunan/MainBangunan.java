package bangunan;
import java.util.Scanner;
public class MainBangunan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
    double panjang,lebar;
    double alas,tinggi,sisi1,sisi2; 
    double jumlah;  
    
        Bangunan b1 = new Bangunan();
        System.out.println("Mengitung Luas Persegi Panjang. . . . ");
        System.out.print("Masukkan Panjang : ");
        panjang=input.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar=input.nextInt();
        b1.setPersegi(panjang,lebar);
        System.out.println("Luas Persegi panjang adalah : "+b1.getLuas(panjang,lebar));
        System.out.println();
        
        System.out.println("Menghitung Luas Trapesium. . . .");
        System.out.print("Masukkan Sisi atas : ");
        sisi1=input.nextInt();
        System.out.print("Masukkan Sisi bawah : ");
        sisi2=input.nextInt();
        System.out.print("Masukkan tinggi : ");
        tinggi=input.nextInt();
        b1.setTrapesium(sisi1,sisi2,tinggi);
        System.out.println("Luas Trapesium adalah : "+b1.getLuas(sisi1,sisi2,tinggi));
        System.out.println();
        
        jumlah=b1.getLuas(panjang, lebar)+b1.getLuas(sisi1, sisi2, tinggi);
        System.out.println("Jumlah kedua sisi adalah : "+jumlah);
    }
}

