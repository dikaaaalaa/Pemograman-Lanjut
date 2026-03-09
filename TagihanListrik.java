import java.util.Scanner;

public class TagihanListrik{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jumlah kWh yang digunakan: ");
        int kwh = scanner.nextInt();

        PelangganListrik pelanggan = new PelangganListrik(nama, kwh);

        System.out.println("\n=== Rincian Tagihan Listrik ===");
        pelanggan.tampilkanTagihan();

        scanner.close();
    }
}
