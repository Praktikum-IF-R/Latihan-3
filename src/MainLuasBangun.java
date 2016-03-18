package mainluasbangunan;
import java.util.Scanner;
public class MainLuasBangun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlah;
        System.out.println("Persegi Panjang");
        System.out.print("Masukkan Panjang : ");
        double p = input.nextDouble();
        System.out.print("Masukkan Lebar\t : ");
        double l = input.nextDouble();
        System.out.println("==========================");
        System.out.println("Trapesium");
        System.out.print("Masukkan Sisi Atas  : ");
        double a = input.nextDouble();
        System.out.print("Masukkan Sisi Bawah : ");
        double b =  input.nextDouble();
        System.out.print("Masukkan Tinggi\t    : ");
        double t = input.nextDouble();
        System.out.println("==========================");
        LuasBangun Persegi_Panjang = new LuasBangun();
        Persegi_Panjang.getLuas(p,l);
        System.out.println("Luas Persegi Panjang : "+Persegi_Panjang.getLuas(p,l));
        LuasBangun Trapesium = new LuasBangun();
        Trapesium.getLuas(a,b,t);
        System.out.println("Luas Trapesium\t     : "+Trapesium.getLuas(a,b,t));
        jumlah = Persegi_Panjang.getLuas(p,l)+Trapesium.getLuas(a,b,t);
        System.out.println("Jumlah Kedua Luas    : "+jumlah);
    }    
}