public class ProdukDemo {
    public static void main(String[] args) {
        // Membuat objek produk baru
        Produk produk1 = new Produk("P001", "Laptop Gaming", 15000000, 10);
        double batas = 10000000;

        produk1.tampilkanInfo(batas);

        System.out.println("\n--- Pengujian Validasi & Transaksi ---");

        // 1. Menguji harga negatif (seharusnya ditolak)
        produk1.setHarga(-500000);

        // 2. Menguji penambahan stok yang valid
        produk1.tambahStok(5);

        // 3. Menguji pengurangan stok yang melebihi batas (seharusnya ditolak)
        produk1.kurangiStok(25);

        // 4. Menguji pengurangan stok yang valid
        produk1.kurangiStok(3);

        System.out.println("\n--- Info Akhir Produk ---");
        produk1.tampilkanInfo(batas);
    }
}