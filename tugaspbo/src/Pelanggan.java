// Kelas Pelanggan yang menggunakan polimorfisme
class Pelanggan {
    private String namaPelanggan;
    private String noHp;
    private Faktur faktur;

    // Constructor
    public Pelanggan(String namaPelanggan, String noHp, Faktur faktur, Integer jumlahBeli) {
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.faktur = faktur;
    }

    // Menampilkan Faktur menggunakan polimorfisme
    public void displayFaktur() {
        System.out.println("\n=== Faktur Pelanggan ===");
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Nomor HP: " + noHp);
        faktur.displayFaktur();
        System.out.println("Total Bayar: " + faktur.hitungTotalBayar());
    }
}
