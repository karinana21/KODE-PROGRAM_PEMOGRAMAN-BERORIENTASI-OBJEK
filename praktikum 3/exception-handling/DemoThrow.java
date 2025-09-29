public class DemoThrow {
    // Method untuk cek umur
    static void cekUmur(int umur) {
        if (umur < 18) {
            // melempar exception manual
            throw new ArithmeticException("Umur harus minimal 18 tahun!");
        } else {
            System.out.println("Akses diizinkan, umur: " + umur);
        }
    }

    public static void main(String[] args) {
        // Contoh 1: akan error
        try {
            cekUmur(15); // akan melempar exception
        } catch (ArithmeticException e) {
            System.out.println("Terjadi exception: " + e.getMessage());
        }

        // Contoh 2: normal
        cekUmur(20); // tidak error
    }
}
