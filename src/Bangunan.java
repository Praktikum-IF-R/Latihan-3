package LuasBangunan;
public class Bangunan {
    private double panjang, lebar, tinggi, sisi1, sisi2, lpersegi, ltrapesium, jumlahluas;
    public void setPanjang(double a){
        this.panjang = a;
    }
    public double getPanjang(){
        return panjang;
    }
    public void setLebar (double l){
        this.lebar = l;
    }
    public double getLebar(){
        return lebar;
    }
    public void setTinggi(double t){
        this.tinggi = t;
    }
    public double getTinggi(){
        return tinggi;
    }
    public void setS1 (double s1){
        this.sisi1 = s1;
    }
    public double getS1(){
        return sisi1;
    }
    public void setS2 (double s2){
        this.sisi2 = s2;
    }
    public double getS2(){
        return sisi2;
    }
    public double Luas(double a, double t){
        lpersegi = panjang*lebar;
        return lpersegi;
    }
    public double Luas(double s1, double s2, double l){
        ltrapesium = ((sisi1+sisi2)/2)*tinggi;
        return ltrapesium;
    }
    public void LuasPersegi(){
        System.out.println("Luas persegi : "+Luas(panjang, lebar));
    }
    public void LuasTrapesium(){
        System.out.println("Luas Trapesium : "+Luas(sisi1, sisi2, tinggi));
    }
    public void JumlahLuas(){
        jumlahluas = Luas(panjang, lebar)+Luas(sisi1, sisi2, tinggi);
        System.out.println("Luas persegi panjang + Luas trapesium : "+jumlahluas);
    }
}
