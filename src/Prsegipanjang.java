/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prsegipanjang;

import java.util.Scanner;

/**
 *
 * @author LENY
 */
public class Prsegipanjang {
public static void HitungLuas(int p, int l) {
        int nilai = p * l;
        System.out.println("maka hasil luas pesegi panjang : " + nilai);
    }

    public static double HitungLuas(double a, double b, double t) {
        double nilai = (a+b)/2*t;
        return nilai;
    }
   
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai panjang : ");
        int p = in.nextInt();
        System.out.print("masukkan nilai lebar : ");
        int l = in.nextInt();
        HitungLuas(p, l);
        System.out.print("masukkan nilai double a : ");
        double a = in.nextDouble();
        System.out.print("masukkan nilai double b : ");
        double b = in.nextDouble();
        System.out.print("masukkan nilai double t : ");
        double t = in.nextDouble();
        System.out.println("Maka hasil luas trapesium : " + HitungLuas(a, b, t));
        double total= (p*l)+((a+b)/2*t);
        System.out.println("total luas adalah "+total);
        Prsegipanjang pj1= new Prsegipanjang();
        
        
        
        
    }
}
        
   
