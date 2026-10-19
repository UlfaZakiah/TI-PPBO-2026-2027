public class Mahasiswa {
    String nama;
    String nim;
    double ipk;

    // Constructor default (tanpa parameter)
    public Mahasiswa() {
        nama = "Belum diisi";
        nim = "-";
        ipk = 0.0;
    }

    // Constructor berparameter
    public Mahasiswa(String nama, String nim, double ipk) {
        this.nama = nama; // this.nama = atribut, nama = parameter
        this.nim = nim;
        this.ipk = ipk;
    }

    public static void main(String[] args) {
        // Objek dan perintah cetak dipindahkan ke dalam metode main
        Mahasiswa m1 = new Mahasiswa(); // constructor default
        Mahasiswa m2 = new Mahasiswa("Siti", "67890", 3.90); // berparameter

        System.out.println(m1.nama + " - " + m1.ipk);
        System.out.println(m2.nama + " - " + m2.ipk);
    }
}