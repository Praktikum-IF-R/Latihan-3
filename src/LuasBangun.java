package mainluasbangunan;
public class LuasBangun {
    private double Persegi_Panjang;
    private double Trapesium;
    public LuasBangun(){
        Persegi_Panjang = 0;
        Trapesium = 0;
    }
    public double getLuas(double p, double l){
        return Persegi_Panjang = p*l;
    }
    public double getLuas(double a, double b, double t){
        return Trapesium = ((a+b)*t)/2;
    }
}
