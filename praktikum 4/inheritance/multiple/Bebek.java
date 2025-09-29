interface Terbang {
    void terbang();
}

interface Berenang {
    void berenang();
}

public class Bebek implements Terbang, Berenang {
    public void terbang() {
        System.out.println("Bebek bisa terbang");
    }

    public void berenang() {
        System.out.println("Bebek bisa berenang");
    }
}
