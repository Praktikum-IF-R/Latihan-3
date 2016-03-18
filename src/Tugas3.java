import java.util.Scanner;
public class Tugas3 {
    public static int luas;
    public static int getLuas(int a, int b){
        luas=a*b;
        return luas;
    }
    public static int getLuas(int a, int b, int c){
        luas=(a+b)*c/2;
        return luas;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang persegi panjang  : ");
        int a = in.nextInt();
        System.out.print("Masukkan panjang persegi panjang  : ");
        int b = in.nextInt();
        System.out.print("Masukkan sisi pertama trapesium   : ");
        int c = in.nextInt();
        System.out.print("Masukkan sisi kedua trapesium     : ");
        int d = in.nextInt();
        System.out.print("Masukkan tinggi trapesium         : ");
        int e = in.nextInt();
        System.out.println("Luas persegi panjang: "+getLuas(a,b));
        System.out.println("Luas trapesium      : "+getLuas(c,d,e));
        System.out.println("Luas keduanya       : "+(getLuas(a,b)+getLuas(c,d,e)));
    }
    
}
