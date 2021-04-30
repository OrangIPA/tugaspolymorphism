package polymorphism.latihan4;

public class Shape {
    private String color;
    public Shape(String color){
        this.color = color;
    }

    @Override
    public String toString(){
        return "Shape[color=" + color + "]"; 
    }

    public double getArea(){
        System.err.println("Shape unknown! cannot compute area");
        return 0;
    }
}
