public class ArrayDemo {
    public static void main(String[] args) {
        // Cara 1: deklarasi langsung dengan nilai awal
        int[] nilai = {80, 75, 90, 60, 88};

        // Cara 2: deklarasi ukuran dulu, isi belakangan
        String[] namaHari = new String[3];
        namaHari[0] = "Senin";
        namaHari[1] = "Selasa";
        namaHari[2] = "Rabu";

        System.out.println("Elemen pertama nilai: " + nilai[0]);
        System.out.println("Jumlah elemen nilai: " + nilai.length);
        System.out.println("Hari kedua: " + namaHari[1]);

        System.out.println("--- Menggunakan for biasa ---");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + ": " + nilai[i]);
        }

        System.out.println("--- Menggunakan enhanced for ---");
        for (int n : nilai) {
            System.out.println(n);
        }
    }
}