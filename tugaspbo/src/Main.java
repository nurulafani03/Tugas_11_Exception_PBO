import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);

            // Input Pelanggan
            System.out.print("Masukkan Nama Pelanggan: ");
            String namaPelanggan = scanner.next();
            System.out.print("Masukkan Nomor HP: ");
            String noHp = scanner.next();
            System.out.print("Masukkan Jumlah Beli :");
            Integer jumlahBeli = scanner.nextInt();

            // Membuat objek Barang dengan Faktur (harga dan nama barang sudah ditetapkan)
            Faktur faktur = new Barang("Buku Tulis", 80000, jumlahBeli);

            // Membuat objek Pelanggan dengan Faktur Barang
            Pelanggan pelanggan = new Pelanggan(namaPelanggan, noHp, faktur, jumlahBeli);

            // Menampilkan Faktur Pelanggan
            pelanggan.displayFaktur();

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
