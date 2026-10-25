public class Persegi {
    double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;  }

    public double hitungLuas() {
        return sisi * sisi;  }

    public double hitungKeliling() {
        return 4 * sisi;  }

    public static void main(String[] args) {
        Persegi p1 = new Persegi(4.0);
        Persegi p2 = new Persegi(7.5);
        Persegi p3 = new Persegi(10.0);

        Persegi[] daftarPersegi = {p1, p2, p3};
        for (int i = 0; i < daftarPersegi.length; i++) {
            System.out.println("Persegi " + (i + 1) + " (Sisi: " + daftarPersegi[i].sisi + ")");
            System.out.println("Luas     : " + daftarPersegi[i].hitungLuas());
            System.out.println("Keliling : " + daftarPersegi[i].hitungKeliling());
            System.out.println();
        }

        System.out.println("========================================");
        System.out.println("PENCARIAN PERSEGI DENGAN LUAS TERBESAR");
        System.out.println("========================================\n");

        Persegi[] listPersegi = {
                new Persegi(5.0),
                new Persegi(12.5),
                new Persegi(8.0),
                new Persegi(10.0)  };

        Persegi terbesar = listPersegi[0];
        for (int i = 1; i < listPersegi.length; i++) {
            if (listPersegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = listPersegi[i];  }
        }

        // Menampilkan hasil pencarian[cite: 1]
        System.out.println("Persegi dengan Luas TERBESAR[cite: 1]:");
        System.out.println("Panjang Sisi : " + terbesar.sisi);
        System.out.println("Luas         : " + terbesar.hitungLuas());
    }
}