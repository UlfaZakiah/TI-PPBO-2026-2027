import java.util.Scanner;

    public class Latihan1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan angka: ");
            int angka = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(angka + " x " + i + " = " + (angka * i));
            }

            sc.close();
        }
    }