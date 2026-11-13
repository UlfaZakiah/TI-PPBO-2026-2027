public class WaktuDemo {
    public static void main(String[] args) {
        // Pengujian nilai valid
        Waktu w1 = new Waktu(14, 30, 45);
        w1.tampilkanWaktu();

        System.out.println("\nMenguji nilai di luar rentang (tidak valid):");
        // Mencoba memasukkan nilai jam, menit, dan detik yang salah
        w1.setJam(25);   // Seharusnya ditolak
        w1.setMenit(75); // Seharusnya ditolak
        w1.setDetik(-5); // Seharusnya ditolak

        System.out.println();
        w1.tampilkanWaktu(); // Waktu harusnya tetap seperti semula atau tidak berubah ke nilai invalid
    }
}