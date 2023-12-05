import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args) {
        // Nilai username dan password yang telah ditentukan
        String usernamebenar = "donat";
        String passwordbenar = "manis";

        // Input username dan password dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String passwordInput = scanner.nextLine();

        // Cek autentikasi
        if (autentikasi(usernameInput, passwordInput, usernamebenar, passwordbenar)) {
            System.out.println("Autentikasi Berhasil");
        } else {
            System.out.println("Autentikasi Gagal");
        }

        // Tutup scanner
        scanner.close();
    }

    // Metode untuk melakukan autentikasi
    private static boolean autentikasi(String usernameInput, String passwordInput, String usernameBenar, String passwordBenar) {
        // Autentikasi berhasil jika username dan password sesuai
        return usernameInput.equals(usernameBenar) && passwordInput.equals(passwordBenar);
    }
}
