package TugasTambahan;

public class OperasiPembagian extends OperasiBilanganAbs{
    protected double a, b, c;

    @Override
    protected void setA(double a){
        this.a = a;
    }

    @Override
    protected void setB(double b){
        this.b = b;
    }

    @Override
    protected void setC(){
        this.c = a / b;
    }

    @Override
    protected double getA(){
        return this.a;
    }

    @Override
    protected double getB(){
        return this.b;
    }

    @Override
    protected double getC(){
        setC();
        return this.c;
    }

    @Override
    protected void tampil(){
        System.out.println(this.getA() + " / " + this.getB() + " = " + this.getC());
    }
}
