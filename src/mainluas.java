package latihan3;
import java.util.Scanner; 
public class mainluas { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        int total,luas;
        luas l1=new luas();
        luas l2=new luas();
        System.out.print("Masukkan panjang : ");
        int p=in.nextInt();
        System.out.print("Masukkan lebar   : ");
        int l=in.nextInt();
        System.out.print("Masukkan sisi1   : ");
        int s1=in.nextInt();
        System.out.print("Masukkan sisi2   : ");
        int s2=in.nextInt();
        System.out.print("Masukkan tinggi  : ");
        int t=in.nextInt();
        total=(l1.getLuas(p,l)+l2.getLuas(s1,s2,t));
        System.out.println("Total luas     :"+total);
    } 
}
    
