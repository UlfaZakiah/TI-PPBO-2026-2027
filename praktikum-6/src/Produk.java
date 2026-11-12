import java.text.NumberFormat;
import java.util.Locale;

public class Produk {
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;   }

    public boolean isMahal(double batasHarga) {
        return this.harga > batasHarga;  }

    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop Gaming", 15000000);
        double batas = 10000000;

        Locale indonesia = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(indonesia);

        System.out.println("Nama Produk : " + produk1.namaProduk);
        System.out.println("Harga       : " + formatRupiah.format(produk1.harga));
        System.out.println("Apakah mahal? " + produk1.isMahal(batas));
    }
}