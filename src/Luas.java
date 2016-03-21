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
public class Luas {
     double luas;
    public void luas(double p,double l){
        luas = p*l;
    }
    public void luas(double a,double b,double t){
        luas = (a+b)*t/2;
    }
    public double getLuas(){
        return luas;
    }
}
