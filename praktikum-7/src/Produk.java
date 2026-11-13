import java.text.NumberFormat;
import java.util.Locale;

public class Produk {
    // 1. Ubah seluruh atribut menjadi private (Encapsulation penuh)
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor berparameter
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        setHarga(harga); // Menggunakan setter agar tervalidasi
        setStokAwal(stok);
    }

    // --- GETTER UNTUK SEMUA ATRIBUT ---
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // --- SETTER DENGAN VALIDASI HARGA (Tidak boleh negatif) ---
    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        } else {
            System.out.println("Harga tidak valid! Harga tidak boleh negatif.");
        }
    }

    private void setStokAwal(int stok) {
        if (stok >= 0) {
            this.stok = stok;
        } else {
            this.stok = 0;
            System.out.println("Stok awal tidak valid, diset ke 0.");
        }
    }

    // --- METHOD TAMBAH STOK DENGAN VALIDASI ---
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
            System.out.println("Berhasil menambah stok. Stok sekarang: " + stok);
        } else {
            System.out.println("Jumlah penambahan stok harus positif (> 0).");
        }
    }

    // --- METHOD KURANGI STOK DENGAN VALIDASI ---
    public void kurangiStok(int jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah pengurangan stok harus positif (> 0).");
        } else if (jumlah > stok) {
            System.out.println("Pengurangan gagal! Stok tidak mencukupi (Stok saat ini: " + stok + ").");
        } else {
            stok -= jumlah;
            System.out.println("Berhasil mengurangi stok. Stok sekarang: " + stok);
        }
    }

    // Method isMahal dari praktikum sebelumnya, disesuaikan dengan getter
    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;
    }

    // Method untuk menampilkan info rapi menggunakan format Rupiah
    public void tampilkanInfo(double batasHarga) {
        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : " + formatRupiah.format(harga));
        System.out.println("Stok        : " + stok);
        System.out.println("Apakah mahal? " + isMahal(batasHarga));
    }
}