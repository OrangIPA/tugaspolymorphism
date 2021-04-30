package polymorphism.latihan4;

public class Triangle extends Shape {
    private int base, height;

    public Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String toString(){
        return "Triangle[base=" + base + ",height=" + height + "," + super.toString() + "]";
    }

    @Override
    public double getArea(){
        return base * height / 2;
    }
}
