public class Mahasiswa {
    private String nama;
    private String nim;
    private double ipk;

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double getIpk() {
        return ipk;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("IPK: " + ipk);
    }
    public void setIpk ( double ipk ) {
        if ( ipk >= 0.0 && ipk <= 4.0 ) {
            this . ipk = ipk ;
        } else {
            System . out . println ( "IPK tidak valid, harus 0.0 - 4.0" );
             }
        }

    public boolean isCumlaude() {
        return this.ipk >= 3.5; // Sesuaikan aturan cumlaude jika ada ketentuan lain di modul
    }
}