
public class OverLoad {

    private double luas;

    double getLuas(int panjang, int lebar) {
        luas = panjang * lebar;
        return luas;
    }

    double getLuas(int sisia, int sisia2, int tinggi) {
        luas = ((sisia + sisia2) * tinggi) / 2;
        return luas;
    }

}
