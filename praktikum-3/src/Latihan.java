import java.util.Scanner;

public class Latihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // ==== LATIHAN 1 ====
        System.out.print("Masukkan Bilangan: ");
        int angka = sc.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan GENAP.");
        } else {
            System.out.println(angka + " adalah bilangan GANJIL.");
        }
        System.out.println ();
        System.out.println ();




        // ==== LATIHAN 2 ====
        System.out.print("Masukkan Bilangan Pertama: ");
        int angka1 = sc.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        int angka2 = sc.nextInt();
        System.out.print("Masukkan Bilangan Ketiga: ");
        int angka3 = sc.nextInt();


        int terbesar;

        if (angka1 >= angka2) {
            if (angka1 >= angka3) {
                terbesar = angka1;
            } else {
                terbesar = angka3;
            }
        } else {
            if (angka2 >= angka3) {
                terbesar = angka2;
            } else {
                terbesar = angka3;
            }
        }
        System.out.println("Bilangan terbesar adalah: " + terbesar);
        System.out.println ();
        System.out.println ();




        // ==== LATIHAN 3 ====
        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Ayam Goreng");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Pilihan Anda: Nasi Goreng");
                break;
            case 2:
                System.out.println("Pilihan Anda: Mie Ayam");
                break;
            case 3:
                System.out.println("Pilihan Anda: Bakso");
                break;
            case 4:
                System.out.println("Pilihan Anda: Ayam Goreng");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
        System.out.println ();
        System.out.println ();



        // ==== LATIHAN 4 ====
        System.out.print("Masukkan umur: ");
        int umur = sc.nextInt();

        System.out.print("Apakah Anda mahasiswa? (true/false): ");
        boolean isMahasiswa = sc.nextBoolean();

        int hargaTiket;

        // Mahasiswa di bawah umur 25 tahun mendapat diskon khusus
        if (isMahasiswa && umur < 25) {
            hargaTiket = 35000; // Harga diskon mahasiswa
            System.out.println("Selamat! Anda mendapatkan harga diskon mahasiswa.");
        } else if (umur < 12) {
            hargaTiket = 25000; // Harga anak-anak
        } else {
            hargaTiket = 50000; // Harga normal
        }

        System.out.println("Harga tiket bioskop: Rp " + hargaTiket);
        System.out.println ();
        System.out.println ();



        // ==== LATIHAN 5 ====
        System.out.print("Masukkan berat badan (kg): ");
        double berat = sc.nextDouble();

        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiCm = sc.nextDouble();


        double tinggiMeter = tinggiCm / 100.0; //cm ke meter

        double bmi = berat / (tinggiMeter * tinggiMeter);  //Rumus BMI

        System.out.printf("Nilai BMI Anda: %.2f\n", bmi);

       //kategori
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Kategori: Normal");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Kategori: Gemuk");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }
}
