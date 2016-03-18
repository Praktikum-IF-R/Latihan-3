package LuasBangunan;

import java.util.Scanner;
public class MainBangunan {
    public static void main(String[] args){
        double p, l, t, s1, s2;
        Scanner in = new Scanner(System.in);
        
        Bangunan fd = new Bangunan();
        System.out.println("=====================");
        System.out.println("PERSEGI PANJANG");
        System.out.print("Masukkan panjang : ");
        p = in.nextDouble();
        fd.setPanjang(p);
        System.out.print("Masukkan lebar : ");
        l = in.nextDouble();
        fd.setLebar(l);
        System.out.println("=====================");
        System.out.println("TRAPESIUM");
        System.out.print("Masukkan sisi 1 : ");
        s1 = in.nextDouble();
        fd.setS1(s1);
        System.out.print("Masukkan sisi 2 : ");
        s2 = in.nextDouble();
        fd.setS2(s2);
        System.out.print("Masukkan tinggi trapesium : ");
        t = in.nextDouble();
        fd.setTinggi(t);
        System.out.println("=====================");
        fd.LuasPersegi();
        fd.LuasTrapesium();
        fd.JumlahLuas();
    }
    
}
