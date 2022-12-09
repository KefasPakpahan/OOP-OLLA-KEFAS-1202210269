public class MainApp {
    public static void main(String[] args) throws Exception {
        TransportasiAir unknwn = new TransportasiAir(5, 10000);
        Sampan sampan = new Sampan(20,50000,2);
        Kapal kapal = new Kapal(10, 20000, "mesin diesel");
        unknwn.informasi();
        unknwn.berlabuh();
        unknwn.berlabuh();
        System.out.println();
        sampan.informasi();
        sampan.berlayar();
        sampan.berlabuh();
        sampan.berlabuh(2);
        System.out.println();
        kapal.informasi();
        kapal.berlayar();
        kapal.berlayar(20);

    }
}
