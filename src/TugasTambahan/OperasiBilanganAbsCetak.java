package TugasTambahan;

public final class OperasiBilanganAbsCetak{
    public void cetakSemua(OperasiBilanganAbs[] OB, double a, double b){
        for(int i = 0; i < OB.length; i++){
            OB[i].setA(a);;
            OB[i].setB(b);
            OB[i].tampil();
        }
    }
}