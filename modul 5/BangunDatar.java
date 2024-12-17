import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("=== Program Hitung Luas dan Keliling Bangun Datar ===");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Persegi Panjang");
            System.out.println("4. Segitiga");
            System.out.println("0. Keluar");
            System.out.print("Pilih bangun datar (0-4): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungPersegi(input);
                    break;
                case 2:
                    hitungLingkaran(input);
                    break;
                case 3:
                    hitungPersegiPanjang(input);
                    break;
                case 4:
                    hitungSegitiga(input);
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        input.close();
    }

    // Fungsi untuk menghitung Persegi
    public static void hitungPersegi(Scanner input) {
        System.out.print("Masukkan panjang sisi persegi: ");
        float sisi = input.nextFloat();
        float luas = sisi * sisi;
        float keliling = 4 * sisi;
        System.out.println("Luas Persegi: " + luas);
        System.out.println("Keliling Persegi: " + keliling);
    }

    // Fungsi untuk menghitung Lingkaran
    public static void hitungLingkaran(Scanner input) {
        System.out.print("Masukkan jari-jari lingkaran: ");
        float jariJari = input.nextFloat();
        float luas = 3.14f * jariJari * jariJari;
        float keliling = 2 * 3.14f * jariJari;
        System.out.println("Luas Lingkaran: " + luas);
        System.out.println("Keliling Lingkaran: " + keliling);
    }

    // Fungsi untuk menghitung Persegi Panjang
    public static void hitungPersegiPanjang(Scanner input) {
        System.out.print("Masukkan panjang: ");
        float panjang = input.nextFloat();
        System.out.print("Masukkan lebar: ");
        float lebar = input.nextFloat();
        float luas = panjang * lebar;
        float keliling = 2 * (panjang + lebar);
        System.out.println("Luas Persegi Panjang: " + luas);
        System.out.println("Keliling Persegi Panjang: " + keliling);
    }

    // Fungsi untuk menghitung Segitiga
    public static void hitungSegitiga(Scanner input) {
        System.out.print("Masukkan alas segitiga: ");
        float alas = input.nextFloat();
        System.out.print("Masukkan tinggi segitiga: ");
        float tinggi = input.nextFloat();
        System.out.print("Masukkan sisi 1: ");
        float sisi1 = input.nextFloat();
        System.out.print("Masukkan sisi 2: ");
        float sisi2 = input.nextFloat();
        System.out.print("Masukkan sisi 3: ");
        float sisi3 = input.nextFloat();

        float luas = (alas * tinggi) / 2;
        float keliling = sisi1 + sisi2 + sisi3;
        System.out.println("Luas Segitiga: " + luas);
        System.out.println("Keliling Segitiga: " + keliling);
    }
}
