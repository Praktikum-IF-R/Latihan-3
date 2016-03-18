package latihan2;
public class luas {

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

    public double getluas(double panjang, double lebar) {
        double luas = panjang * lebar;
        return luas;
    }

    public double getluas(double atas, double tinggi, double bawah) {
        double luas = ((atas + bawah) * tinggi) / 2;
        return luas;
        
    }
}

