/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3;

import java.util.Scanner;

/**
 *
 * @author Deltaviyahya
 */
public class MainLUAS {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        LUAS obj1 = new LUAS();
        System.out.println("Masukkan data untuk persegi panjang");
        System.out.print("Masukkan panjang              : ");
        double p = c.nextDouble();c.nextLine();
        System.out.print("Masukkan lebar                : ");
        double l = c.nextDouble();
        obj1.getLuaspersegi(p, l);

        LUAS obj2 = new LUAS();
        System.out.println("=====================================");
        System.out.println("Masukkan data untuk trapesium");
        System.out.print("Masukkan sisi atas            : ");
        double a = c.nextDouble(); c.nextLine();
        System.out.print("Masukkan sisi bawah           : ");
        double b = c.nextDouble();
        System.out.print("Masukkan tinggi               : ");
        double t = c.nextDouble();
        obj2.getLuastrapesium(a, b, t);
        
        double total = obj1.getLuaspersegi(p, l) + obj2.getLuastrapesium(a, b, t);
        
        System.out.println("======================================");
        System.out.println("Luas persegi panjang        : " + obj1.getLuaspersegi(p, l));
        System.out.println("Luas trapesium              : " + obj2.getLuastrapesium(a, b, t));
        System.out.println("Jumlah luas keduanya        : " + total);
        
    }
}
