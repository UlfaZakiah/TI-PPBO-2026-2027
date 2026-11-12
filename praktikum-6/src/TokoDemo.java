public class TokoDemo {
    public static void main(String[] args) {
        // A. Membuat array of object TugasProduk berisi minimal 5 produk berbeda[cite: 3]
        TugasProduk[] daftarProduk = {
                new TugasProduk("P001","Mouse Gaming",250000,10),
                new TugasProduk("P002","Keyboard Mechanical",750000, 5),
                new TugasProduk("P003","Monitor 24 Inch",2100000,3),
                new TugasProduk("P004","Headset Bluetooth",400000,8),
                new TugasProduk("P005","Mousepad Extended",75000,15)
        };

        // B. Menampilkan seluruh data produk menggunakan perulangan[cite: 3]
        System.out.println("=== DAFTAR SELURUH PRODUK TOKO ===");
        for (int i = 0; i < daftarProduk.length; i++) {
            System.out.println("Produk ke-" + (i + 1));
            daftarProduk[i].tampilkanData();
        }

        System.out.println("\n=== SIMULASI PEMBELIAN (2 PRODUK BERBEDA) ===");

        // Simulasi Pembelian 1: Stok mencukupi (Membeli 2 unit Mouse Gaming)
        int beli1 = 2;
        System.out.println("Membeli " + beli1 + " unit " + daftarProduk[0].namaProduk);
        System.out.println("Total Harga: Rp " + String.format("%,.0f", daftarProduk[0].hitungTotalHarga(beli1)));
        daftarProduk[0].kurangiStok(beli1);

        System.out.println();

        // Simulasi Pembelian 2: Skenario stok TIDAK mencukupi (Membeli 10 unit Monitor, stok sisa 3)[cite: 3]
        int beli2 = 10;
        System.out.println("Membeli " + beli2 + " unit " + daftarProduk[2].namaProduk);
        daftarProduk[2].kurangiStok(beli2);

        System.out.println("\n=== PENCARIAN PRODUK TERMAHAL ===");

        // C. Menghitung dan menampilkan produk dengan harga TERMAHAL menggunakan perulangan[cite: 3]
        TugasProduk produkTermahal = daftarProduk[0];
        for (int i = 1; i < daftarProduk.length; i++) {
            if (daftarProduk[i].harga > produkTermahal.harga) {
                produkTermahal = daftarProduk[i];
            }
        }

        System.out.println("Produk dengan harga TERMAHAL adalah:");
        produkTermahal.tampilkanData();
    }
}