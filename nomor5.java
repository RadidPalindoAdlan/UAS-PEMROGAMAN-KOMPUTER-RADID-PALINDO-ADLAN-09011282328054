import java.util.Scanner;

public class nomor5 {

    public static void main(String[] args) {

        // Deklarasikan variabel
        Scanner scanner = new Scanner(System.in);
        double angka1;
        double angka2;
        int pilihan;

        // Membaca input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        angka2 = scanner.nextDouble();

        // Pilihan operasi
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");

        System.out.print("Masukkan nomor operasi: ");
        pilihan = scanner.nextInt();

        // Hitung dan tampilkan hasil
        switch (pilihan) {
            case 1:
                System.out.println("Hasil penjumlahan: " + penjumlahan(angka1, angka2));
                break;
            case 2:
                System.out.println("Hasil pengurangan: " + pengurangan(angka1, angka2));
                break;
            case 3:
                System.out.println("Hasil perkalian: " + perkalian(angka1, angka2));
                break;
            case 4:
                if (angka2 != 0) {
                    System.out.println("Hasil pembagian: " + pembagian(angka1, angka2));
                } else {
                    System.out.println("Pembagian oleh nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan operasi tidak valid.");
        }

        // Tutup scanner
        scanner.close();
    }

    // Metode untuk operasi penjumlahan
    private static double penjumlahan(double a, double b) {
        return a + b;
    }

    // Metode untuk operasi pengurangan
    private static double pengurangan(double a, double b) {
        return a - b;
    }

    // Metode untuk operasi perkalian
    private static double perkalian(double a, double b) {
        return a * b;
    }

    // Metode untuk operasi pembagian
    private static double pembagian(double a, double b) {
        return a / b;
    }
}