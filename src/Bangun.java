public class Bangun {
private int p,l,a,t,b, luas, luas1;    
public Bangun (){
this.p=p;
this.l=l;
}
public Bangun (int a, int t, int b){
    this.a=a;
    this.t=t;
    this.b=b;
}
public void Bangun(int p, int l){
    luas= p*l;
}
public void Bangun(int a,int t,int b){
    luas1= ((a+b)/2)*t;
}
public double getLuas(int p, int l){
 return luas;
}
public double getLuas(int a, int t, int b){
   return luas1;
}
}
