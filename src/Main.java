
public class Main {
    public static void main(String[] args) {
        pl persegi = new pl();
        pl trapesium = new pl();
        persegi.Luas(10,20);
        trapesium.Luas(5,10,3);
        System.out.println("Luas Persegi :"+persegi.getLuas());
        System.out.println("Luas Trapesium : "+trapesium.getLuas());
        System.out.println("Jumlah kedua Luas bangun : "+(persegi.getLuas()+trapesium.getLuas()));
    }
}
