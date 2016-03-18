package hitungluas;

public class HitungLuas {

    private int persegiPanjang;
    private int Trapesium;
    private int panjang;
    private int lebar;
    private int tinggi;
    private int keduanya;
    private int luas =0;

    public HitungLuas() {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public HitungLuas(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    

    public int getLuas(int panjang, int lebar){
           luas = this.panjang * this.lebar;
        return luas;
        
    }
    public int getLuas(int panjang, int lebar, int tinggi){
         luas = (this.panjang+this.lebar)*this.tinggi;
        return luas;
   
    }
    public int getKeduanya(){
            keduanya = getLuas(panjang, lebar) + getLuas(panjang,lebar, tinggi);
            return keduanya;
    }
    public void displayMessage(){
        System.out.println("1. LUAS PERSEGI PANJANG: "+getLuas( panjang, lebar));
        System.out.println("2. LUAS TRAPESIUM      : "+getLuas(panjang,lebar,tinggi));
        System.out.println("JUMLAH LUAS KEDUANYA ADALAH "+(getLuas( panjang, lebar)+ getLuas(panjang,lebar,tinggi)));
    }

}
