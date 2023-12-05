import java.util.Scanner;

public class nomor4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan bulat positif
        System.out.print("Masukkan bilangan bulat positif untuk difaktorisasi: ");
        int bilangan = scanner.nextInt();

        // Tampilkan hasil faktorisasi
        System.out.print("Faktorisasi " + bilangan + ": ");
        faktorisasi(bilangan);

        // Tutup scanner
        scanner.close();
    }

    // Metode untuk melakukan faktorisasi
    private static void faktorisasi(int bilangan) {
        for (int i = 2; i <= bilangan; i++) {
            while (bilangan % i == 0) {
                System.out.print(i);
                bilangan /= i;

                if (bilangan > 1) {
                    System.out.print(" * ");
                }
            }
        }
    }
}
