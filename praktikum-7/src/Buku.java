public class Buku {
    private String judul;
    private String pengarang;
    private int tahunTerbit;

    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Getter
    public String getJudul() { return judul; }
    public String getPengarang() { return pengarang; }
    public int getTahunTerbit() { return tahunTerbit; }

    // Setter
    public void setJudul(String judul) { this.judul = judul; }
    public void setPengarang(String pengarang) { this.pengarang = pengarang; }

    public static void main(String[] args) {
        // 1. Menampilkan 2 objek awal menggunakan Getter
        Buku buku1 = new Buku("Atomic Habits", "James Clear", 2019);
        Buku buku2 = new Buku("Algoritma dan Struktur Data", "Rina Marlina", 2021);

        System.out.println("--- Buku 1 ---");
        System.out.println("Judul        : " + buku1.getJudul());
        System.out.println("Pengarang    : " + buku1.getPengarang());
        System.out.println("Tahun Terbit : " + buku1.getTahunTerbit());

        System.out.println("\n--- Buku 2 ---");
        System.out.println("Judul        : " + buku2.getJudul());
        System.out.println("Pengarang    : " + buku2.getPengarang());
        System.out.println("Tahun Terbit : " + buku2.getTahunTerbit());

        System.out.println("\n========================================\n");

        // 2. Array of Object Buku (minimal 4 buku)
        Buku[] daftarBuku = {
                new Buku("Filosofi Teras", "Henry Manampiring", 2023),
                new Buku("Belajar Java OOP", "Budi", 2016),
                new Buku("The Psychology of Money", "Morgan Housel", 2024),
                new Buku("Kecerdasan Buatan", "Dedi", 2020)
        };

        System.out.println("Daftar Judul Buku yang Terbit Setelah Tahun 2015:");
        for (int i = 0; i < daftarBuku.length; i++) {
            // Menggunakan getTahunTerbit() karena atribut sudah private
            if (daftarBuku[i].getTahunTerbit() > 2015) {
                System.out.println("- " + daftarBuku[i].getJudul() + " (Tahun: " + daftarBuku[i].getTahunTerbit() + ")");
            }
        }
    }
}