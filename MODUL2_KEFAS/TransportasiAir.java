public class TransportasiAir {
    protected int JumlahKursi;
    protected int biaya;
    // constructor function
    public TransportasiAir(int JumlahKursi,int biaya){
        this.JumlahKursi = JumlahKursi;
        this.biaya = biaya;
    };
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketahui dengan kursi berjumlah " + this.JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    };
    public void berlayar(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlayar");
    };
    public void berlabuh(){
        System.out.println("Transportasi Air dengan jenis tidak diketahui sedang berlabuh");
    };
}
