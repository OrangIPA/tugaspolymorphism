package polymorphism.TugasPraktikum;

public class RectTest {
    public static void main(String[] args) {
        Rect a = new Rect(2, 4, 7, 10);
        Rect b = new Rect(-1, 4, 2, 8);
        int titikX1 = 3, titikY1 = 2;

        if(a.union(b).isInside(titikX1, titikY1)){
            System.out.println("(" + titikX1 + "," + titikY1 + ") is inside the union");
        }else{
            System.out.println("(" + titikX1 + "," + titikY1 + ") is outside the union");
        }
        System.out.println(coordRect(a) + " union " + coordRect(b) + " = " + coordRect(a.union(b)));
        System.out.println(coordRect(a) + " intersect " + coordRect(b) + " = " + coordRect(a.intersect(b)));
    }
    public static String coordRect(Rect a){
        return "(" + a.x1 + "," + a.y1 + ";" + a.x2 + "," + a.y2 + ")";
    }
}
