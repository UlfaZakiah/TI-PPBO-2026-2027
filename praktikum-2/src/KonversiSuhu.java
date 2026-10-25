import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu dalam Celsius: ");
        double celsius = input.nextDouble();

        //Rumus
        double fahrenheit = celsius * 9.0 / 5.0 + 32;

        System.out.println("Suhu dalam Fahrenheit: " + fahrenheit);

        input.close();
    }
}