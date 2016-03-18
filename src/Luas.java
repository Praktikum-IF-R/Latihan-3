/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas;
import java.util.Scanner;
public class Luas {
    public static double HitungLuas(int a, int b){
        double luas = a*b;
        return luas;
    }
    public static double HitungLuas(int a1, int a2, int t){
        double luas = ((a1+a2)*t)/2;
        return luas;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan panjang pp : ");
        int a = in.nextInt();
        System.out.print("Masukkan lebar pp : ");
        int b = in.nextInt();
        System.out.println("=====================");
        System.out.print("Masukkan alas1 : ");
        int a1 = in.nextInt();
        System.out.print("Masukkan alas2 : ");
        int a2 = in.nextInt();
        System.out.print("Masukkan tinggi : ");
        int t = in.nextInt();
        System.out.println("=====================");
        System.out.println("Luas persegi panjang : "+HitungLuas(a,b));
        System.out.println("Luas trapesium : "+HitungLuas(a1,a2,t));
        System.out.println("Jumlah luas total : "+(HitungLuas(a,b)+HitungLuas(a1,a2,t)));
    }
    
}
