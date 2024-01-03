import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean berlanjut = true;

        do {
            System.out.println("== KALKULATOR HITUNG LUAS DAN VOLUME ==");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            System.out.println("4. Jajargenjang");
            System.out.println("5. Tabung");
            System.out.println("6. Keluar");
            System.out.print("Pilih bangun datar atau ruang yang ingin dihitung luas atau volumenya: ");

            scanner.nextLine();
            if (scanner.hasNextInt()) {
                int pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        hitungLuasPersegi(scanner);
                        break;
                    case 2:
                        hitungLuasLingkaran(scanner);
                        break;
                    case 3:
                        hitungLuasSegitiga(scanner);
                        break;
                    case 4:
                        hitungLuasJajargenjang(scanner);
                        break;
                    case 5:
                        hitungVolumeTabung(scanner);
                        break;
                    case 6:
                        berlanjut = false;
                        System.out.println("Terima kasih, program selesai.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                }
            } else {
                System.out.println("Input tidak valid. Harap masukkan nomor.");
                scanner.next();
            }
        } while (berlanjut);

        scanner.close();
    }

    private static void hitungLuasPersegi(Scanner scanner) {
        System.out.print("Masukkan panjang sisi persegi (cm): ");
        double sisi = scanner.nextDouble();

        double luas = sisi * sisi;

        System.out.printf("Luas persegi: %.2f cm^2%n", luas);
        System.out.println("Tekan Enter");
        scanner.nextLine();
    }

    private static void hitungLuasLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari lingkaran (cm): ");
        double jariJari = scanner.nextDouble();

        double luas = Math.PI * jariJari * jariJari;

        System.out.printf("Luas lingkaran: %.2f cm^2%n", luas);
        scanner.nextLine();
    }

    private static void hitungLuasSegitiga(Scanner scanner) {
        System.out.print("Masukkan alas segitiga (cm): ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga (cm): ");
        double tinggi = scanner.nextDouble();

        double luas = 0.5 * alas * tinggi;

        System.out.printf("Luas segitiga: %.2f cm^2%n", luas);
    }

    private static void hitungLuasJajargenjang(Scanner scanner) {
        System.out.print("Masukkan alas jajargenjang (cm): ");
        double alas = scanner.nextDouble();

        System.out.print("Masukkan tinggi jajargenjang (cm): ");
        double tinggi = scanner.nextDouble();

        double luas = alas * tinggi;

        System.out.printf("Luas jajargenjang: %.2f cm^2%n", luas);
    }

    private static void hitungVolumeTabung(Scanner scanner) {
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = scanner.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = scanner.nextDouble();

        double volume = Math.PI * jariJari * jariJari * tinggi;

        System.out.printf("Volume tabung: %.2f cm^3%n", volume);
    }
}
