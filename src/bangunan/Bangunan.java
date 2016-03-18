
package bangunan;
   public class Bangunan {
    double panjang,lebar;
    double tinggi,sisi1,sisi2; 
    double getLuas; 
       
    public void setPersegi(double p, double l){
        panjang=p;
        lebar=l;
    }
    public void setTrapesium(double t, double s1, double s2){
        tinggi=t;
        sisi1=s1;
        sisi2=s2;
    }
    public double getLuas(double panjang, double lebar){
       double luas=(panjang*lebar);
       return luas;
        
    }
    public double getLuas(double sisi1, double sisi2, double tinggi){
        double luas=((sisi1+sisi2)*tinggi)/2;
        return luas;     
    }
    }

    

 

