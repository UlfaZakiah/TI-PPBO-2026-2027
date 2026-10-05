public class Latihan3 {
    // Versi 1: Konversi Celsius ke Fahrenheit
    static double konversiSuhu(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Versi 2: Konversi Celsius ke Kelvin atau Fahrenheit sesuai parameter
    static double konversiSuhu(double celsius, String skalaTujuan) {
        if (skalaTujuan.equalsIgnoreCase("Kelvin") || skalaTujuan.equalsIgnoreCase("K")) {
            return celsius + 273.15;
        } else if (skalaTujuan.equalsIgnoreCase("Fahrenheit") || skalaTujuan.equalsIgnoreCase("F")) {
            return konversiSuhu(celsius); // Memanggil versi 1
        } else {
            System.out.println("Skala tidak dikenal! Mengembalikan nilai Celsius.");
            return celsius;
        }
    }

    public static void main(String[] args) {
        System.out.println("=== LATIHAN 3 ===");
        double celsius = 100.0;

        // Memanggil versi 1 (Default Fahrenheit)
        System.out.println(celsius + "°C ke Fahrenheit: " + konversiSuhu(celsius) + "°F");

        // Memanggil versi 2 (Ke Kelvin)
        System.out.println(celsius + "°C ke Kelvin: " + konversiSuhu(celsius, "Kelvin") + " K");

        // Memanggil versi 2 (Ke Fahrenheit)
        System.out.println(celsius + "°C ke Fahrenheit: " + konversiSuhu(celsius, "Fahrenheit") + "°F");
    }
}