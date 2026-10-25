import java.util.Scanner;

public class Latihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Masukkan " + n + " angka:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Nilai terbesar pertama : " + max1);
        System.out.println("Nilai terbesar kedua   : " + max2);

        sc.close();
    }
}