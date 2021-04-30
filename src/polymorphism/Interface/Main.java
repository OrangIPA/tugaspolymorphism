package polymorphism.Interface;

public class Main {
    public static void main(String[] args) {
        Line disIsObject = new Line(32, 245, 923, 235);
        Line datIsObject = new Line(534, 345, 194, 938);
        System.out.println(disIsObject.getLength());
        System.out.println("disIsObject is greater than datIsObject: " + disIsObject.isGreater(disIsObject, datIsObject));
        System.out.println(disIsObject);
    }
}
