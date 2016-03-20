
public class pl {
    double luas,total;
    public void Luas(double p,double l){
        luas = p*l;
        total+=luas;
    }
    public void Luas(double a,double b,double t){
        luas = ((a+b)*t)/2;
        total+=luas;
    }
    public double getLuas(){
        return luas;
    }
    public double jumlahkeduabidang(){
        return total;
    }
}
