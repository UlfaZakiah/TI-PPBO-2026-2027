public class SiswaDemo {
    public static void main(String[] args) {
        // Menguji objek Siswa dengan nilai awal valid
        Siswa siswa1 = new Siswa(88.5);
        System.out.println("Nilai Angka : " + siswa1.getNilai());
        System.out.println("Nilai Huruf : " + siswa1.getNilaiHuruf());

        System.out.println("\nMenguji setter dengan nilai tidak valid:");
        siswa1.setNilai(105.0); // Seharusnya ditolak

        // Menguji nilai valid lainnya
        siswa1.setNilai(65.0);
        System.out.println("Nilai Angka Baru : " + siswa1.getNilai());
        System.out.println("Nilai Huruf Baru : " + siswa1.getNilaiHuruf());
    }
}