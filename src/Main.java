/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Luas persegi = new Luas();
        Luas trapesium = new Luas();
        persegi.luas(10,20);
        trapesium.luas(5,10,3);
        System.out.println("Luas Persegi :"+persegi.getLuas());
        System.out.println("Luas Trapesium : "+trapesium.getLuas());
        System.out.println("Jumlah kedua Luas bangun : "+(persegi.getLuas()+trapesium.getLuas()));
    }
}
