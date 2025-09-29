public class MainHewan {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        k.makan(); // dari parent
        k.suara(); // dari child
    }
}
