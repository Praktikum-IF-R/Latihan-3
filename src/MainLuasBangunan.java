/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainluasbangunan;

import java.util.Scanner;

/**
 *
 * @author Acer-pc
 */
public class MainLuasBangunan {
    private static int luasPersegiPanjang;
    private static int luasTrapesium;
    
    private static int getLuas(int p, int l){
        luasPersegiPanjang = p*l;
        return luasPersegiPanjang;
    }
    
    private static int getLuas(int s, int s2, int t){
        luasTrapesium = ((s+s2)*t)/2;
        return luasTrapesium;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int p,l,s,s2,t,pilih;
     
        Scanner in = new Scanner(System.in);
        
                 System.out.println("...................................");
                 System.out.println("Luas Persegi Panjang :");
                 System.out.print("Masukan panjang :");
                 p = in.nextInt();
                 System.out.print("Masukan lebar   :");
                 l = in.nextInt();
                 System.out.println("Luas            :"+getLuas(p,l));
                 System.out.println("...................................");
              
                 System.out.println("...................................");
                 System.out.println("Luas Trapesium :");
                 System.out.print("Masukan sisi 1  :");
                 s = in.nextInt();
                 System.out.print("Masukan sisi 2  :");
                 s2 = in.nextInt();
                 System.out.print("Masukan tinggi  :");
                 t = in.nextInt();
                 System.out.println("Luas            :"+getLuas(s,s2,t));
                 System.out.println("...................................");
            
                 System.out.println("...................................");
                 System.out.println("Total Luas 2 Bangun :"+(getLuas(p,l)+getLuas(s,s2,t)));
                 System.out.println("...................................");
    
        
    }
    
}
