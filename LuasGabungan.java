import java.util.Scanner;
public class LuasGabungan {
    public static double HitungLuasPersegiPanjang(double panjang, double lebar){
        double luaspersegipanjang = panjang* lebar;
        System.out.println("Luas Persegi Panjang : "+luaspersegipanjang);
        return luaspersegipanjang;
    }
    public static double HitungLuasTrapesium(double sisi1, double sisi2, double tinggi){
        double luastrapesium = (sisi1+sisi2)*tinggi/2;
        System.out.println("Luas Trapesium : "+luastrapesium);
        return luastrapesium;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan panjang : ");
        double panjang = input.nextDouble();
        System.out.print("masukkan lebar : ");
        double lebar = input.nextDouble();
        HitungLuasPersegiPanjang(panjang, lebar);
        System.out.print("masukkan nilai sisi 1 : ");
        double sisi1 = input.nextDouble();
        System.out.print("masukkan nilai sisi 2 : ");
        double sisi2 = input.nextDouble();
        System.out.print("masukkan tinggi : ");
        double tinggi = input.nextDouble();
        HitungLuasTrapesium(sisi1, sisi2, tinggi);
        System.out.println("=================================================");
        double LuasGabungan = HitungLuasPersegiPanjang(panjang, lebar) + HitungLuasTrapesium(sisi1, sisi2, tinggi);
        System.out.println("Luas Gabungan = "+LuasGabungan);
    }  
}
