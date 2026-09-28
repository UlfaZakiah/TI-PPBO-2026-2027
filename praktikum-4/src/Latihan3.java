import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Masukkan 10 angka:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("--- Urutan Terbalik ---");
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}