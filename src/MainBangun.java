
import java.util.Scanner;

public class MainBangun {
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
         double jumlahKeduanya;
         System.out.println("-Persegi Panjang-");
         System.out.print("Masukkan Panjang Persegi Panjang : ");
         double p = input.nextDouble();
         System.out.print("Masukkan Lebar Persegi Panjang   : ");
        double l = input.nextDouble();
         System.out.println("----------------------------------");
         System.out.println("-Trapesium-");
         System.out.print("Masukkan Sisi Atas Trapesium     : ");
         double a = input.nextDouble();
         System.out.print("Masukkan Sisi Bawah Trapesium    : ");
         double b =  input.nextDouble();
        System.out.print("Masukkan Tinggi Trapesium         : ");
         double t = input.nextDouble();
         System.out.println("-----------------------------------");
         bangun Persegi_Panjang = new bangun();
         Persegi_Panjang.getLuas(p,l);
         System.out.println("Luas Persegi Panjang : "+Persegi_Panjang.getLuas(p,l));
         bangun Trapesium = new bangun();
        Trapesium.getLuas(a,b,t);
         System.out.println("Luas Trapesium\t     : "+Trapesium.getLuas(a,b,t));
         jumlahKeduanya = Persegi_Panjang.getLuas(p,l)+Trapesium.getLuas(a,b,t);
         System.out.println("Jumlah Kedua Luas    : "+jumlahKeduanya);
     }    
 } 

    
