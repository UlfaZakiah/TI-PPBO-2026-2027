public class LatihanClass {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa ( "Budi" , "111" , 3.5 );

        m1. ipk = 9.9 ; // seharusnya TIDAK MASUK AKAL, IPK maksimal 4.0
        m1. nim = "" ; // NIM kosong, seharusnya tidak valid

        System . out . println ( m1. ipk ); // program tetap 'menerima' nilai yangsalah
    }
}
