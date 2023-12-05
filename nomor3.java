import java.util.Scanner;

public class nomor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nilai n
        System.out.print("Masukkan nilai n untuk deret Fibonacci: ");
        int n = scanner.nextInt();

        // Tampilkan deret Fibonacci hingga suku ke-n
        System.out.println("Deret Fibonacci hingga suku ke-" + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        // Tutup scanner
        scanner.close();
    }

    // Metode untuk menghitung suku ke-n dalam deret Fibonacci
    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
