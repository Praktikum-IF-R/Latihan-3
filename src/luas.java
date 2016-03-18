package latihan3;
public class luas {
    private int luas;
    public int getLuas(int a,int b,int c){
        luas=(a+b)*c/2;
        System.out.println("Luas trapesium       : "+luas); 
        return luas;
    }
    public int getLuas(int a,int b){
        luas=a*b;
        System.out.println("Luas persegi panjang : "+luas);
        return luas;
    }
}  