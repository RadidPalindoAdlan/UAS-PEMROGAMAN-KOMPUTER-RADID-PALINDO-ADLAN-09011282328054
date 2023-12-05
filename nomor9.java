import java.util.Scanner;
import java.util.Stack;

public class nomor9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ekspresi matematika
        System.out.print("Masukkan ekspresi matematika: ");
        String ekspresi = scanner.nextLine();

        // Memeriksa apakah urutan kurung benar
        if (cekUrutanKurung(ekspresi)) {
            System.out.println("Urutan kurung pada ekspresi benar.");
        } else {
            System.out.println("Urutan kurung pada ekspresi salah.");
        }

        // Tutup scanner
        scanner.close();
    }

    // Metode untuk memeriksa urutan kurung
    private static boolean cekUrutanKurung(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char karakter : ekspresi.toCharArray()) {
            if (karakter == '(' || karakter == '{' || karakter == '[') {
                // Jika karakter adalah kurung buka, push ke dalam stack
                stack.push(karakter);
            } else if (karakter == ')' || karakter == '}' || karakter == ']') {
                // Jika karakter adalah kurung tutup, periksa dengan kurung buka terakhir di stack
                if (stack.isEmpty()) {
                    return false; // Kurung tutup tanpa pasangan kurung buka
                }

                char kurungBuka = stack.pop();

                // Periksa apakah pasangan kurung buka dan kurung tutup sesuai
                if ((karakter == ')' && kurungBuka != '(') ||
                        (karakter == '}' && kurungBuka != '{') ||
                        (karakter == ']' && kurungBuka != '[')) {
                    return false; // Kurung tutup tidak sesuai dengan pasangannya
                }
            }
        }

        // Pastikan stack kosong setelah memeriksa seluruh ekspresi
        return stack.isEmpty();
    }
}
