public class MainApp {
    public static void main(String[] args) {
        Perangkat perangkat = new Perangkat("Agata", 12, 2.7F);
        System.out.println("");
        perangkat.informasi();

        Laptop laptop = new Laptop("Seagate", 16, 2.9F, true);
        System.out.println("");
        laptop.informasi();
        laptop.bukaGame("Warcraft");
        laptop.kirimEmail("Megicula@gmail.com");
        laptop.kirimEmail("Absolute@gmail.com", "Arizona@gmail.com");

        Handphone handphone = new Handphone("Iphone", 8, 12F, false);
        System.out.println("");
        handphone.informasi();
        handphone.telfon(62116797);
        handphone.kirimSMS(62122178);
        handphone.kirimSMS(6142972, 6218972);
    }
}
