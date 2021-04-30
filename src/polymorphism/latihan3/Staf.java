package polymorphism.latihan3;

public class Staf extends Pegawai {
    private static final int gajiStaf = 50000;
    private static final int bonusStaf = 10000;

    public int gaji(){
        return gajiStaf;
    }
    public int bonus(){
        return bonusStaf;
    }
}
