public class Energi {
    private int massa, kecepatan;

    public Energi(int massa, int kecepatan) {
        this.massa = massa;
        this.kecepatan = kecepatan;
    }

    public int getMassa() {
        return massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public double hitungEnergi() {
        return 0.5 * massa / 1000 * kecepatan * kecepatan;
    }

}
