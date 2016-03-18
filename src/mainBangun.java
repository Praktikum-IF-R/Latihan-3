import java.util.Scanner;
public class mainBangun {
    public static void main(String[] args) {
        Scanner puta= new Scanner (System.in);
        int p,l,a,t;
        Bangun pp = new Bangun ();
        System.out.print("Masukkan panjang: ");
        p= puta.nextInt();
        System.out.print("Masukkan lebar: ");
        l=puta.nextInt();
        pp.Bangun(p,l);
        System.out.println("Luas Persegi panjang: "+pp.getLuas(p,l));
        System.out.println();
        System.out.print("Masukkan a: ");
        a= puta.nextInt();
        System.out.print("Masukkan b: ");
        int b= puta.nextInt();
        System.out.print("Masukkan tinggi: ");
        t= puta.nextInt();
        Bangun tp= new Bangun (a,t,b);
        tp.Bangun(a,t,b);
        System.out.println("Luas Trapesium : "+tp.getLuas(a, t, b));
        System.out.println("Jumlah: "+(tp.getLuas(a, t, b)+pp.getLuas(p, l)));
    }

   
    
}
