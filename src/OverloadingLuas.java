package Overloading;
import java.util.Scanner;
/**
 *
 * @author Zedd
 */
public class OverloadingLuas {
 double  Luaspp,LuasTrap,Luas ;
    public double Luas(double p,double l){
        Luaspp = p*l;
        return Luaspp;
    }
    public double Luas(double p1,double p2,double t){
        LuasTrap = ((p1+p2)*t)/2;
        return LuasTrap;
    }
    public void Jumluas(double L1,double L2){
        Luas = L1 + L2;
        System.out.println("jumlah luas kedua bangun adalah "+Luas);
    }
    public static void main(String[] args) {
        OverloadingLuas luas = new OverloadingLuas();
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang =  ");
        double pan = in.nextDouble();
        System.out.print("Masukkan lebar  persegi panjang  =  ");
        double leb = in.nextDouble();
        System.out.println("Luas Persegi panjang adalah "+ luas.Luas(pan, leb));
        System.out.print("Masukkan sisi atas trapesium     =  ");
        double s1 = in.nextDouble();
        System.out.print("Masukkan sisi bawah trapesium    =  ");
        double s2 = in.nextDouble();
        System.out.print("Masukkan tinggi trapesium        =  ");
        double t = in.nextDouble();
        System.out.println("Luas Trapesium adalah "+ luas.Luas(s1, s2, t));
        luas.Jumluas(luas.Luas(pan, leb), luas.Luas(s1, s2, t));
    }
}