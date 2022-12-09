public class Sampan extends TransportasiAir {
    protected int layar;
    // constructor function
    public Sampan(int JumlahKursi, int biaya,int layar) {
        super(JumlahKursi, biaya);
        this.layar = layar;
    };
    // overriding function
    @Override
    public void informasi(){
        System.out.println("Transportasi Air sampan dengan kursi berjumlah " + this.JumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + this.biaya);
    };
    // overriding function
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air sampan sedang berlayar menggunakan " + this.layar + " layar.");
    };
    // overriding function
    @Override
    public void berlabuh(){
        System.out.println("Transportasi Air sampan sedang berlabuh di pantai tanpa jangkar.");
    };
    // overloading function
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air sampan sedang berlabuh di pantai menggunakan "+ jangkar +" jangkar.");
    };
}

