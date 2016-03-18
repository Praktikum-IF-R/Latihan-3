/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadingMethod;

import java.util.Scanner;

/**
 *
 * @author DS
 */
public class Latihan {


    public static int Luas(int panjang, int lebar) {
        int luas = panjang * lebar;
        System.out.println("luas persegi adalah " + luas);
        return luas;
    }

    public static int Luas(int a, int b, int t) {
        int tra = ((a + b) * t) / 2;
        System.out.println("luas trapesium adalah " + tra);
        return tra;
    }
   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        System.out.print("masukkan nilai panjang : ");
        int a = in.nextInt();
        System.out.print("masukkan nilai lebar : ");
        int b = in.nextInt();
        Luas(a,b);
        System.out.print("masukkan sisi a : ");
        int sisi1 = in.nextInt();
        System.out.print("masukkan sisi b : ");
        int sisi2 = in.nextInt();
        System.out.print("masukkan tinggi : ");
        int tinggi = in.nextInt();
        Luas(sisi1,sisi2,tinggi);
        System.out.println("penambahan bangun datar tersebut "+ (Luas(a,b)+Luas(sisi1,sisi2,tinggi)));
    }

}
