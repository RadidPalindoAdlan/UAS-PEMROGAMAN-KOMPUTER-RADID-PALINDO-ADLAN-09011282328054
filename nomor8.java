import java.util.Scanner;

public class nomor8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String username = scanner.nextLine();

        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();

        // Validasi input username dan password
        if (isValidInput(username, password)) {
            Akun akun1 = new Akun(username, password, true);

            System.out.println("\nMenu Akun:");
            System.out.println("1. Tampilkan informasi akun");
            System.out.println("2. Ubah status akun");
            System.out.println("3. Keluar");

            int pilihan;
            do {
                System.out.print("\nMasukkan pilihan: ");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        akun1.tampilkanInformasi();
                        break;
                    case 2:
                        akun1.ubahStatus();
                        akun1.tampilkanInformasi();
                        break;
                    case 3:
                        System.out.println("Keluar dari program.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                }
            } while (pilihan != 3);
        } else {
            System.out.println("Username atau password tidak valid. Program berhenti.");
        }

        scanner.close();
    }

    private static boolean isValidInput(String username, String password) {
        // Tambahkan validasi sesuai kebutuhan, misalnya panjang minimum password
        return username.length() > 0 && password.length() > 0;
    }
}

class Akun {

    private String username;
    private String password;
    private boolean aktif;

    public Akun(String username, String password, boolean aktif) {
        this.username = username;
        this.password = password;
        this.aktif = aktif;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAktif() {
        return aktif;
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    public void tampilkanInformasi() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password); // Biasanya sebaiknya hindari menampilkan password
        System.out.println("Status: " + (aktif ? "Aktif" : "Nonaktif"));
    }

    public void ubahStatus() {
        aktif = !aktif;
    }
}