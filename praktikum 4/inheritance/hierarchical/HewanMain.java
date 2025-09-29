public class HewanMain {
    public static void main(String[] args) {
        Kucing k = new Kucing();
        Anjing a = new Anjing();

        k.hidup();   // dari Hewan
        k.suara();   // dari Kucing

        a.hidup();   // dari Hewan
        a.suara();   // dari Anjing
    }
}
