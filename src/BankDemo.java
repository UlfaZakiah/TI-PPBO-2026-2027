public class BankDemo {
    public static void main(String[] args) {
        // Membuat minimal 2 objek RekeningBank
        RekeningBank rek1 = new RekeningBank("001", "Budi", 500000, "Tabungan");
        RekeningBank rek2 = new RekeningBank("002", "Siti", 200000, "Giro");

        System.out.println("--- Status Awal ---");
        rek1.cetakMutasi();
        rek2.cetakMutasi();

        System.out.println("--- Pengujian Transaksi Setor & Tarik ---");
        rek1.setor(100000);
        rek2.tarik(50000);

        System.out.println("\n--- Pengujian Transfer ---");
        // 1. Transfer Berhasil
        rek1.transferKe(rek2, 150000);

        // 2. Transfer Gagal (Saldo tidak cukup)
        rek1.transferKe(rek2, 1000000);

        // 3. Transfer Gagal (Jumlah negatif)
        rek1.transferKe(rek2, -50000);

        System.out.println("\n--- Mutasi Akhir Kedua Rekening ---");
        rek1.cetakMutasi();
        rek2.cetakMutasi();
    }
}