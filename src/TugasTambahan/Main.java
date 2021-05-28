package TugasTambahan;

public class Main {
    public static void main(String[] args){
        OperasiBilanganAbs tambah = new OperasiPenjumlahan();
        OperasiBilanganAbs kurang = new OperasiPengurangan();
        OperasiBilanganAbs kali = new OperasiPerkalian();
        OperasiBilanganAbs bagi = new OperasiPembagian();

        OperasiBilanganAbs aritmatika[] = {tambah, kurang, kali, bagi};
        OperasiBilanganAbsCetak operator = new OperasiBilanganAbsCetak();

        operator.cetakSemua(aritmatika, 10.5, 4.5);
    }
}
