public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            // kode yang berpotensi error
            int angka = 10 / 0;   // akan memicu ArithmeticException
            System.out.println("Hasil: " + angka);
        } catch (ArithmeticException e) {
            // menangani error pembagian dengan nol
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            // blok ini akan selalu dijalankan, apapun yang terjadi
            System.out.println("Blok finally selalu dijalankan, entah ada error atau tidak.");
        }
    }
}
