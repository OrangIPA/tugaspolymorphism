package polymorphism.latihan3;

public class Pegawai {
    String nama;
    int gaji;

    Pegawai(){
    }

    Pegawai(String nama){
        this.nama = nama;
        System.out.println("Pegawai");
    }
    public int gaji(){
        return 0;
    }
}
