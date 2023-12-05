import java.util.Scanner;

public class nomor6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kata atau frase
        System.out.print("Masukkan kata atau frase: ");
        String input = scanner.nextLine();

        // Cek apakah kata atau frase adalah palindrom
        if (isPalindrom(input)) {
            System.out.println("'" + input + "' adalah palindrom.");
        } else {
            System.out.println("'" + input + "' bukan palindrom.");
        }

        // Tutup scanner
        scanner.close();
    }

    // Metode untuk mengecek apakah suatu kata atau frase adalah palindrom
    private static boolean isPalindrom(String input) {
        // Hilangkan spasi dan ubah menjadi huruf kecil
        String cleanedInput = input.replaceAll("\\s", "").toLowerCase();

        // Bandingkan dengan kebalikan dari kata atau frase
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();

        return cleanedInput.equals(reversedInput);
    }
}
