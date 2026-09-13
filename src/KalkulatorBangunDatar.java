//KalkulatorBangunDatar
/*Program untuk menghitung luas dan keliling persegi panjang
  serta lingkaran, dan mengecek kriteria luasBesar (> 100). */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input data persegi pamjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        //Menghitung luas dan keliling persegi panjang
        double luasPersegiPanjang = panjang * lebar;
        double kelilingPersegiPanjang = 2 * (panjang + lebar);

        //Menampilkan hasil perhitungan persegi panjang
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang);

        //input data lingkaran
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        double r = input.nextDouble();

        //Perhitungan luas dan keliling lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * r * r;
        double kelilingLingkaran = 2 * Math.PI * r;

        //Menampilkan hasil perhitungan lingkaran
        System.out.println("Luas Lingkaran: " + luasLingkaran);
        System.out.println("Keliling Lingkaran: " + kelilingLingkaran);

        //Mengecek apakah luas persegi panjang > 100
        boolean luasBesar = luasPersegiPanjang > 100;

        //Menampilkan status luasBesar
        System.out.println("\nApakah luas persegi panjang > 100? " + luasBesar);

        input.close();
    }
}