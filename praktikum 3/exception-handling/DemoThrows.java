import java.io.FileReader;
import java.io.IOException;

public class DemoThrows {
    // Method ini bisa melempar IOException
    static void bacaFile() throws IOException {
        FileReader fr = new FileReader("data.txt"); // jika file tidak ada -> IOException
        int karakter = fr.read();
        while (karakter != -1) {
            System.out.print((char) karakter);
            karakter = fr.read();
        }
        fr.close();
    }

    public static void main(String[] args) {
        try {
            bacaFile(); // panggil method yang pakai throws
        } catch (IOException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }
    }
}
