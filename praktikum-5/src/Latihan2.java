public class Latihan2 {
        // Method untuk mengecek apakah n adalah bilangan prima
        static boolean isPrima(int n) {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;  }
            }
            return true;
        }

        public static void main(String[] args) {
            System.out.println("=== LATIHAN 2 ===");
            System.out.println("Bilangan prima dari 1 sampai 50 adalah:");

            for (int i = 1; i <= 50; i++) {
                if (isPrima(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
}
