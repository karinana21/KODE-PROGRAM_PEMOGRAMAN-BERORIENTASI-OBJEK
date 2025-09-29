import java.util.Scanner;

public class AkunBankTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Membuat akun dengan saldo awal 50
        AkunBank akun = new AkunBank(50);
        System.out.println("Saldo awal: " + akun.getSaldo());

        // Menu sederhana
        int pilihan;
        do {
            System.out.println("\n=== Menu Akun Bank ===");
            System.out.println("1. Menabung");
            System.out.println("2. Tarik Tunai");
            System.out.println("3. Lihat Saldo");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah tabungan: ");
                    int jumlahTabung = input.nextInt();
                    akun.menabung(jumlahTabung);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah tarik tunai: ");
                    int jumlahTarik = input.nextInt();
                    akun.tarikTunai(jumlahTarik);
                    break;

                case 3:
                    System.out.println("Saldo sekarang: " + akun.getSaldo());
                    break;

                case 0:
                    System.out.println("Terima kasih, keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        input.close();
    }
}
