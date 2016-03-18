package bangunan;
import java.util.Scanner;
public class Bangunan {
    
    public static int Luaspersegipanjang(int a , int b){
        int luas;
        luas = a * b ;
        return luas;
    }
    
    public static int Luastrapesium(int a , int b , int c){
        int luas;
        luas = ( (a+b) * c )/2;
        return luas;
    }
    
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Persegi Panjang          : ");
        int a = in.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang            : ");
        int b = in.nextInt();
        System.out.println("Luas Persegi Panjang                      : "+Luaspersegipanjang( a , b));
        
        System.out.println("==============================================");
        
        System.out.print("Masukkan Panjang Sisi 1                   : ");
        int c = in.nextInt();
        System.out.print("Masukkan Panjang Sisi 2                   : ");
        int d = in.nextInt();
        System.out.print("Masukkan Tinggi Trapesium                 : ");
        int e = in.nextInt();
        System.out.print("Luas Trapesium                            : "+Luastrapesium(c,d,e));
        System.out.println("");
        System.out.println("==============================================");
        System.out.println("Jumlah Luas Persegi Panjang dan Trapesium : "+(Luaspersegipanjang( a , b)+Luastrapesium(c,d,e)));
    }
}
