package polymorphism.AbstractClass;
public class Aeroplane extends Vehicle{
    public void walk(){
        System.out.println("Aeroplane is flying");
    }
    public void fuel(){
        System.out.println("Fuels");
    }
    public static void main(String[] args) {
        Aeroplane garuda = new Aeroplane();
        garuda.function();
        garuda.fuel();
        garuda.walk();
    }
}