public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // membuat object

        m1.nama = "Budi";
        m1.nim = "12345";
        m1.ipk = 3.75;

        System.out.println("Nama: " + m1.nama);
        System.out.println("Nim: " + m1.nim);
        System.out.println("IPK: " + m1.ipk);
    }
}
