public class PelangganListrik {
    private String namaPelanggan;
    private int jumlahKwh;
    private double tarifPerKwh = 1500;

    public PelangganListrik(String namaPelanggan, int jumlahKwh) {
        this.namaPelanggan = namaPelanggan;
        this.jumlahKwh = jumlahKwh;
    }

    public double hitungTagihan() {
        return jumlahKwh * tarifPerKwh;
    }

    public void tampilkanTagihan() {
        System.out.println("Nama Pelanggan: " + namaPelanggan);
        System.out.println("Jumlah kWh: " + jumlahKwh);
        System.out.println("Tarif per kWh: Rp " + tarifPerKwh);
        System.out.println("Total Tagihan: Rp " + hitungTagihan());
    }
}
