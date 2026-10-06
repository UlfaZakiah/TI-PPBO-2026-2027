public class Latihan1 {
    // Method untuk menghitung luas persegi panjang (p x l)
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    // Method untuk menghitung luas lingkaran (PI * r * r)
    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("--- LATIHAN 1 ---");

        // Pengujian Luas Persegi Panjang dengan input berbeda
        double p1 = 10.0, l1 = 5.0;
        double p2 = 7.5, l2 = 3.2;
        System.out.println("Luas Persegi Panjang (" + p1 + " x " + l1 + "): " + luasPersegiPanjang(p1, l1));
        System.out.println("Luas Persegi Panjang (" + p2 + " x " + l2 + "): " + luasPersegiPanjang(p2, l2));

        System.out.println();

        // Pengujian Luas Lingkaran dengan input berbeda
        double r1 = 7.0;
        double r2 = 10.0;
        System.out.printf("Luas Lingkaran (r = %.1f): %.2f\n", r1, luasLingkaran(r1));
        System.out.printf("Luas Lingkaran (r = %.1f): %.2f\n", r2, luasLingkaran(r2));
    }
}
