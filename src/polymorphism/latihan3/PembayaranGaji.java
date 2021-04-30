package polymorphism.latihan3;

public class PembayaranGaji {
    public int hitungGaji(Pegawai peg){
        int uang = peg.gaji;
        if(peg instanceof Direktur){
            uang += ((Direktur)peg).tunjangan();
        }
        if(peg instanceof Staf){
            uang += ((Staf)peg).bonus();
        }
        return uang;
    }
    public static void main(String[] args) {
        PembayaranGaji pg = new PembayaranGaji();
        Staf ali = new Staf();
        Direktur tony = new Direktur();
        System.out.println("Gaji untuk Ali : " + pg.hitungGaji(ali));
        System.out.println("Gaji untuk Tony : " + pg.hitungGaji(tony));
    }
}
