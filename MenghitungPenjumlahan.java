import java.util.Scanner;

//class
class Kalkulator{

    int angka1;
    int angka2;

    public Kalkulator(int a, int b) {
        angka1 = a;
        angka2 = b;
    }

    int tambah() {
        return angka1 + angka2;
    }
}

    public class MenghitungPenjumlahan{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan angka pertama: ");
            int a = input.nextInt();

            System.out.print("Masukkan angka kedua: ");
            int b = input.nextInt();

            Kalkulator kalkulator = new Kalkulator(a, b);
            int hasil = kalkulator.tambah();

            System.out.println("Hasil penjumlahan: " + hasil);

        }
    }
