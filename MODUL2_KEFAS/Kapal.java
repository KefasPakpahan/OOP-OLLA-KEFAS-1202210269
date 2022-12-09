public class Kapal extends TransportasiAir{
    protected String mesin;
    // constructor function
    public Kapal(int JumlahKursi, int biaya,String mesin) {
        super(JumlahKursi, biaya); //super method diambil dari constructor parent class
        this.mesin = mesin;
    };
    // override function
    @Override
    public void informasi(){
        System.out.println("Transportasi Air Kapal dengan kursi berjumlah " + this.JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    };
    // override function
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air Kapal sedang berlayar menggunakan " + this.mesin + " dengan kecepatan yang tidak stabil.");
    };
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air Kapal sedang berlayar menggunakan " + this.mesin + " dengan kecepatan yang stabil dikisaran " + kecepatan + " knot");
    };
    // overload function
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air Kapal sedang berlabuh di pantai");
    };
}
