public class LatihanClass {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa(); // membuat object

        m1.nama = "Budi";
        m1.nim = "12345";
        m1.ipk = 3.75;

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Siti";
        m2.nim = "67890";
        m2.ipk = 3.90;


        System.out.println(m1.nama + "-" + m1.ipk);
        System.out.println(m2.nama + "-" + m2.ipk);

    }
}
