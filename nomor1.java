import java.util.Scanner;

public class nomor1 {

    public static void main(String[] args) {

        // Deklarasikan variabel
        int jumlahBarang;
        int hargaBarang;
        int diskon;
        int totalHarga;

        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah barang: ");
        jumlahBarang = scanner.nextInt();
        System.out.print("Masukkan harga barang: ");
        hargaBarang = scanner.nextInt();

        // Menghitung diskon
        if (jumlahBarang < 5) {
            diskon = 0;//diskon 0 persen jika barang kurang dari 5
        } else if (jumlahBarang <= 10) {
            diskon = hargaBarang * 5 / 100;// mendapat diskon 5 persen jika barang lebih dari 5 dan kurang atau sama dengan 10
        } else if (jumlahBarang <= 20) {
            diskon = hargaBarang * 10 / 100;// mendapat diskon 10 persen jika barang lebih dari 10 dan kurang dari atas sama dengan 20
        } else {
            diskon = hargaBarang * 20 / 100;//mendapat diskon 20 persen jika barang lebih dari 20
        }

        // Menghitung total harga
        totalHarga = hargaBarang - diskon;

        // Menampilkan hasil
        System.out.println("Jumlah barang: " + jumlahBarang);
        System.out.println("Harga barang: Rp" + hargaBarang);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total harga: Rp" + totalHarga);
    }
}