// Kelas Barang yang mengimplementasikan Faktur
class Barang implements Faktur {
    public String nomorFaktur;
    public String namaBarang;
    public double hargaBarang = 80000;
    public int jumlahBeli;

    // Constructor
    public Barang(String namaBarang, double hargaBarang, int jumlahBeli) {
        this.nomorFaktur = generateNomorFaktur();
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
        this.jumlahBeli = jumlahBeli;
    }

    public String generateNomorFaktur() {
        // Implementasi generate nomor faktur (misalnya, menggunakan UUID)
        return "INV-" + System.currentTimeMillis();
    }

    // Implementasi dari interface Faktur
    @Override
    public void displayFaktur() {
        System.out.println("Nomor Faktur: " + nomorFaktur);
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga Barang: " + hargaBarang);
        System.out.println("Jumlah Beli: " + jumlahBeli);

    }

    @Override
    public double hitungTotalBayar() {
        return hargaBarang * jumlahBeli;
    }
}
