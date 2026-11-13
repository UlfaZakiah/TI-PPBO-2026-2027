public class Waktu {
    // Atribut private sesuai instruksi
    private int jam;
    private int menit;
    private int detik;

    // Constructor
    public Waktu(int jam, int menit, int detik) {
        setJam(jam);
        setMenit(menit);
        setDetik(detik);
    }

    // --- GETTER ---
    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getDetik() {
        return detik;
    }

    // --- SETTER DENGAN VALIDASI ---
    public void setJam(int jam) {
        if (jam >= 0 && jam <= 23) {
            this.jam = jam;
        } else {
            System.out.println("Jam tidak valid (" + jam + "). Harus antara 0 - 23.");
        }
    }

    public void setMenit(int menit) {
        if (menit >= 0 && menit <= 59) {
            this.menit = menit;
        } else {
            System.out.println("Menit tidak valid (" + menit + "). Harus antara 0 - 59.");
        }
    }

    public void setDetik(int detik) {
        if (detik >= 0 && detik <= 59) {
            this.detik = detik;
        } else {
            System.out.println("Detik tidak valid (" + detik + "). Harus antara 0 - 59.");
        }
    }

    // Method untuk menampilkan waktu
    public void tampilkanWaktu() {
        System.out.printf("Waktu: %02d:%02d:%02d\n", jam, menit, detik);
    }
}