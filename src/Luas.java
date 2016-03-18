/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan111237_anita;
import java.util.Scanner;
/**
 *
 * @author guest-gd5vdd
 */
public class Luas {
    public static int luaspersegi (int p, int l){
        int luas = p*l;
        System.out.println(luas);
        return luas;
    }
    public static int luastrapesium(int a, int b, int t){
        int luas = ((a+b)*t)/2;
        System.out.println(luas);
        return luas;
    }

    public static void main(String[] args ){
        Scanner in = new Scanner(System.in);
        System.out.println("--- PERSEGI PANJANG --- ");
        System.out.print("Masukkan panjang persegi   : ");
        int a = in.nextInt();
        System.out.print("Masukkan lebar persegi     : ");
        int b = in.nextInt();
        System.out.print("Luas persegi panjang       : ");
        luaspersegi(a,b);
        System.out.println("");
        
        System.out.println("--- TRAPESIUM ---");
        System.out.print("Masukkan panjang sisi 1    : ");
        int c = in.nextInt();
        System.out.print("Masukkan panjang sisi 2    : ");
        int d = in.nextInt();
        System.out.print("Masukkan tinggi            : ");
        int e = in.nextInt();
        System.out.print("Luas trapesium             : ");
        luastrapesium(c,d,e);
        System.out.println("");
        
        int total = (luaspersegi(a,b) + luastrapesium(c,d,e));
        System.out.println("Luas TOTAL               : "+total);
        
    }
}
