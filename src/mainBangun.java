package Bangun;
import java.util.Scanner;
public class mainBangun {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double j;
        System.out.println("Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        double p = input.nextDouble();
        System.out.print("Masukkan Lebar   : ");
        double l = input.nextDouble();
        System.out.println("==========================");
        System.out.println("Trapesium");
        System.out.print("Masukkan Sisi Atas  : ");
        double a = input.nextDouble();
        System.out.print("Masukkan Sisi Bawah : ");
        double b =  input.nextDouble();
        System.out.print("Masukkan Tinggi     : ");
        double t = input.nextDouble();
        System.out.println("==========================");
        bangun LuasP = new bangun();
        LuasP.getLuas(p,l);
        System.out.println("Luas Persegi Panjang : "+LuasP.getLuas(p,l));
        bangun LuasT = new bangun();
        LuasT.getLuas(a,b,t);
        System.out.println("Luas Trapesium       : "+LuasT.getLuas(a,b,t));
        j = LuasP.getLuas(p,l)+LuasT.getLuas(a,b,t);
        System.out.println("Jumlah Kedua Luas    : "+j);
    }   

    }
