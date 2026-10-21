public class Buku {
        String judul;
        String pengarang;
        int tahunTerbit;

        // Constructor berparameter menggunakan this
        public Buku(String judul, String pengarang, int tahunTerbit) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.tahunTerbit = tahunTerbit;
        }

        public static void main(String[] args) {
            // Membuat 2 objek berbeda di method main
            Buku buku1 = new Buku("Atomic Habits", "James Clear", 2019);
            Buku buku2 = new Buku("Algoritma dan Struktur Data", "Rina Marlina", 2021);

            // Menampilkan datanya
            System.out.println("--- Buku 1 ---");
            System.out.println("Judul        : " + buku1.judul);
            System.out.println("Pengarang    : " + buku1.pengarang);
            System.out.println("Tahun Terbit : " + buku1.tahunTerbit);

            System.out.println("\n--- Buku 2 ---");
            System.out.println("Judul        : " + buku2.judul);
            System.out.println("Pengarang    : " + buku2.pengarang);
            System.out.println("Tahun Terbit : " + buku2.tahunTerbit);
        }
    }
