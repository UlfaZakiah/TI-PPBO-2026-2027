public class RekeningBank {
    private String nomorRekening;
    private String pemilik;
    private double saldo;
    private String jenisRekening; // Atribut baru yang read-only

    // Constructor lengkap dengan validasi saldo awal dan jenis rekening
    public RekeningBank(String nomorRekening, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomorRekening = nomorRekening;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    // --- GETTER ---
    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getPemilik() {
        return pemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getJenisRekening() {
        return jenisRekening; // Read-only (tidak ada setter untuk jenisRekening)
    }

    // --- METHOD SETOR ---
    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0.");
            return;
        }
        saldo += jumlah;
        System.out.println("Setor berhasil ke rek " + nomorRekening + ". Saldo sekarang: " + saldo);
    }

    // --- METHOD TARIK ---
    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Tarik gagal pada rek " + nomorRekening + ": Saldo tidak mencukupi.");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil dari rek " + nomorRekening + ". Saldo sekarang: " + saldo);
        }
    }

    // --- METHOD TRANSFER (Tugas Poin 2) ---
    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer gagal: Jumlah transfer harus lebih dari 0.");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal dari " + this.pemilik + " ke " + tujuan.getPemilik() + ": Saldo tidak mencukupi.");
        } else {
            this.saldo -= jumlah;
            tujuan.saldo += jumlah;
            System.out.println("Transfer BERHASIL sebesar " + jumlah + " dari " + this.pemilik + " ke " + tujuan.getPemilik());
        }
    }

    // --- METHOD CETAK MUTASI (Tugas Poin 3) ---
    public void cetakMutasi() {
        System.out.println("========================================");
        System.out.println("          LAPORAN MUTASI REKENING       ");
        System.out.println("========================================");
        System.out.println("Nomor Rekening : " + nomorRekening);
        System.out.println("Pemilik        : " + pemilik);
        System.out.println("Jenis Rekening : " + jenisRekening);
        System.out.println("Saldo Saat Ini : Rp " + saldo);
        System.out.println("========================================\n");
    }
}