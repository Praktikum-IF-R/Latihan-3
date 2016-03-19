import java.util.Scanner;
public class LuasTrapesium {
    public static void HitungLuasTrapesium(int sisi1,int sisi2, int tinggi){
        int luas = (sisi1+sisi2)*tinggi/2;
        System.out.println("maka luas trapesium : "+luas);
    }
    public static double HitungLuasTrapesium(double sisi1, double sisi2, double tinggi){
        double luas = (sisi1+sisi2)*tinggi/2;
        return luas;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai sisi 1 (int) : ");
        int integer1 = input.nextInt();
        System.out.print("masukkan nilai sisi 2 (int) : ");
        int integer2 = input.nextInt();
        System.out.print("masukkan tinggi (int) : ");
        int tinggiint = input.nextInt();
        HitungLuasTrapesium(integer1, integer2, tinggiint);
        System.out.print("masukkan nilai sisi 1 (double) : ");
        double double1 = input.nextDouble();
        System.out.print("masukkan nilai sisi 2 (double) : ");
        double double2 = input.nextDouble();
        System.out.print("masukkan tinggi (double) : ");
        double tinggidouble = input.nextDouble();
        HitungLuasTrapesium(double1, double2, tinggidouble);
        System.out.println("Maka luas trapesium :"+HitungLuasTrapesium(double1, double2, tinggidouble));
    }
}