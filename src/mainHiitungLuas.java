package hitungluas;

import java.util.Scanner;

public class mainHiitungLuas {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Panjang:  ");
        int p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        int l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        int t = input.nextInt();
        System.out.println("");
        HitungLuas hitungan1 = new HitungLuas(p, l, t);
        HitungLuas hitungan2 = new HitungLuas();
        hitungan1.displayMessage();

    }
}
