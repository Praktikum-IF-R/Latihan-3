
public class Luas {

    private double panjang, lebar, atas, bawah, tinggi;

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getAtas() {
        return atas;
    }

    public void setAtas(double atas) {
        this.atas = atas;
    }

    public double getBawah() {
        return bawah;
    }

    public void setBawah(double bawah) {
        this.bawah = bawah;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getLuas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public double getLuas(double atas, double bawah, double tinggi) {
        double luas = ((atas + bawah) * tinggi) * 0.5;
        return luas;
    }

    public void showResult() {
        System.out.println("Luas persegi panjang : " + getLuas(panjang, lebar));
        System.out.println("Luas trapesium : " + getLuas(atas, bawah, tinggi));
        System.out.println("Jumlah luas keduanya : " + getLuas(panjang, lebar) + getLuas(atas, bawah, tinggi));
    }
}
