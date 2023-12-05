import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    // Konstruktor untuk membuat objek buku
    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public Buku(String string, Object tampilkanInformasi) {
    }

    // Metode untuk menampilkan informasi buku
    public void tampilkanInformasi() {
        System.out.println("Informasi Buku:");
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Sedang Dipinjam" : "Tersedia"));
    }

    // Metode untuk meminjam buku
    public void pinjamBuku() {
        if (!dipinjam) {
            System.out.println("Buku berhasil dipinjam.");
            dipinjam = true;
        } else {
            System.out.println("Buku sedang tidak tersedia untuk dipinjam.");
        }
    }
}

public class nomor7 {
    public static void main(String[] args) {
        // Membuat objek buku
        Buku buku1 = new Buku("Laskar pelangi", "Andrea Hirata", 2005);
        Buku buku2 = new Buku("The Star and I ", "Ilana Tan", 2021);

        // Menampilkan informasi buku
        buku1.tampilkanInformasi();
        System.out.println();
        buku2.tampilkanInformasi();

        // Meminjam buku
        buku1.pinjamBuku();
        System.out.println();

        // Menampilkan informasi buku setelah dipinjam
        buku1.tampilkanInformasi();
        System.out.println();
        buku2.tampilkanInformasi();
    }
}
