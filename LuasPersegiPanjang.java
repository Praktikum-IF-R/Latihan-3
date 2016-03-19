import java.util.Scanner;
public class LuasPersegiPanjang {
    public static void HitungLuasPersegiPanjang(int panjang,int lebar){
        int luas = panjang*lebar;
        System.out.println("maka hasil luas persegi panjang : "+luas);
    }
    public static double HitungLuasPersegiPanjang(double panjang, double lebar){
        double luas = panjang* lebar;
        return luas;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai panjang (int) : ");
        int panjang = in.nextInt();
        System.out.print("masukkan nilai lebar (int) : ");
        int lebar = in.nextInt();
        HitungLuasPersegiPanjang(panjang, lebar);
        System.out.print("masukkan nilai panjang (double) : ");
        double panjangdouble = in.nextDouble();
        System.out.print("masukkan nilai lebar (double) : ");
        double lebardouble = in.nextDouble();
        HitungLuasPersegiPanjang(panjangdouble, lebardouble);
        System.out.println("Maka hasil luas persegi panjang :"+HitungLuasPersegiPanjang(panjangdouble, lebardouble));
    }       
}