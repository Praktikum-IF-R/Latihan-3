package A;
public class pl {
    double luas;
    public void Luas(double p,double l){
        luas = p*l;
    }
    public void Luas(double a,double b,double t){
        luas = (a+b)*t/2;
    }
    public double getLuas(){
        return luas;
    }
}
