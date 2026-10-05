public class MethodDemo {
    // Method void: tidak mengembalikan nilai apa pun
    static void sapa(String nama) {
        System.out.println("Halo, " + nama + "!");
    }

    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " (" + umur + " tahun) - " + kota);
    }

    // Panggil pada method main:
    public static void main(String[] args) {
        sapa("Budi");
        sapa("Siti");


        // Panggil pada method main:
        tampilkanBiodata("Budi", 20, "Bandung");
    }
}