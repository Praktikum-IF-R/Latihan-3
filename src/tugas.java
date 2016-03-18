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
public class tugas {
    private int luas;
    public int getluas(int a,int b, int c){
        luas=(a+b)*c/2;
        return luas;
    }
    public int getluas(int a,int b){
        luas=a*b;
        return luas;
    }    
}
