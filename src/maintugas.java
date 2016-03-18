/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class maintugas {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        int jumlah;
        tugas t1=new tugas();
        tugas t2=new tugas();
        System.out.println("masukan panjang persegi panjang: ");
        int a=masuk.nextInt();
        System.out.println("masukan lebar persegi panjang: ");
        int b =masuk.nextInt();
        System.out.println("masukan alas trapesium: ");
        int c=masuk.nextInt();
        System.out.println("masukan atas trapesium: ");
        int d=masuk.nextInt();
        System.out.println("masukan tinggi trapesium: ");
        int e=masuk.nextInt();
        jumlah=(t1.getluas(a, b)+t2.getluas(c, d, e));
        System.out.println("jumlah: "+jumlah);
    }
}
