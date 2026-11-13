public class Buku {
    String judul;
    String pengarang;
    int tahunTerbit;

    // Constructor berparameter menggunakan this[cite: 1]
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public static void main(String[] args) {
        // 1. Menampilkan 2 objek awal sesuai kode Anda
        Buku buku1 = new Buku("Atomic Habits", "James Clear", 2019);
        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Rina Marlina", 2021);

        System.out.println("--- Buku 1 ---");
        System.out.println("Judul        : " + buku1.judul);
        System.out.println("Pengarang    : " + buku1.pengarang);
        System.out.println("Tahun Terbit : " + buku1.tahunTerbit);

        System.out.println("\n--- Buku 2 ---");
        System.out.println("Judul        : " + buku2.judul);
        System.out.println("Pengarang    : " + buku2.pengarang);
        System.out.println("Tahun Terbit : " + buku2.tahunTerbit);

        System.out.println("\n========================================\n");

        // 2. Tambahan untuk Latihan 4: Array of Object Buku (minimal 4 buku)[cite: 1]
        Buku[] daftarBuku = {
                new Buku("Filosofi Teras", "Henry Manampiring", 2023),
                new Buku("Belajar Java OOP", "Budi", 2016),
                new Buku("The Psychology of Money", "Morgan Housel", 2024),
                new Buku("Kecerdasan Buatan", "Dedi", 2020)
        };

        System.out.println("Daftar Judul Buku yang Terbit Setelah Tahun 2015[cite: 1]:");
        // Menggunakan perulangan untuk menyaring dan menampilkan[cite: 1]
        for (int i = 0; i < daftarBuku.length; i++) {
            if (daftarBuku[i].tahunTerbit > 2015) {
                System.out.println("- " + daftarBuku[i].judul + " (Tahun: " + daftarBuku[i].tahunTerbit + ")");
            }
        }
    }
}