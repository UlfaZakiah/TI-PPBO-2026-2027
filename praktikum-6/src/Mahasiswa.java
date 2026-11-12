public class Mahasiswa {
    String nama;
    String nim;
    double ipk;


    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;  }

    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama; // this.nama = atribut, nama = parameter
        this.nim = nim;
        this.ipk = ipk;  }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK : " + ipk);  }

    public boolean isCumlaude() {
        return ipk >= 3.5;
    }
}