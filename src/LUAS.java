/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB3;
/**
 *
 * @author Deltaviyahya
 */
public class LUAS {
   
    double p, l, a, b, t, total;
    
    public double getLuaspersegi(double p, double l) {
        double luas = p * l;
        return luas;
    }
    
    public double getLuastrapesium(double a, double b, double t) {
        double luas = ((a + b) * t) * 0.5;
        return luas;
    }
    
    public void gettotal(){
        total = getLuastrapesium(a,b,t) + getLuaspersegi(p,l);
        
    }
    
    
    
  
}
