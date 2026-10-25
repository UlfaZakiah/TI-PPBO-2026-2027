public class TugasProduk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    public TugasProduk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;  }

    public double hitungTotalHarga(int jumlahBeli) {
        return this.harga * jumlahBeli;  }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) { this.stok -= jumlah;
            System.out.println("Pembelian sukses! Sisa stok"+this.namaProduk+"sekarang:"+this.stok);
        } else {
            System.out.println("Stok tidak mencukupi untuk produk " + this.namaProduk + "!");  }
    }
    public void tampilkanData() {
        System.out.println("Kode Produk  : " + kodeProduk);
        System.out.println("Nama Produk  : " + namaProduk);
        System.out.println("Harga        : Rp " + String.format("%,.0f", harga));
        System.out.println("Stok         : " + stok);
        System.out.println("----------------------------------------");  }
}