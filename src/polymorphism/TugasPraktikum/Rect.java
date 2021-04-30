package polymorphism.TugasPraktikum;

public class Rect {

    /* 4 sudut persegi panjang */
    public int x1, x2, y1, y2;

    /* Konstruktor Utama */
    public Rect(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    /* Konstruktor dengan titik (0, 0) */
    public Rect(int width, int height){
        this(0, 0, width, height);
    }

    /* Konstruktor dengan ukuran 0 */
    public Rect(){
        this(0, 0, 0, 0);
    }

    /* Menggeser posisi persegi panjang */
    public void move(int dx, int dy){
        this.x1 += dx;
        this.x2 += dx;
        this.y1 += dy;
        this.y2 += dy;
    }

    /* Memeriksa titik */
    public boolean isInside(int x, int y){
        return ((x1 <= x && x <= x2) || (x1 >= x && x >= x2)) && ((y1 <= y && y <= y2) || (y1 >= y && y >= y2));
    }

    /* Mengggabung 2 persegi panjang */
    public Rect union(Rect r){
        return new Rect
        (
            (this.x1 < r.x1) ? this.x1 : r.x1,
            (this.y1 < r.y1) ? this.y1 : r.y1,
            (this.x2 > r.x2) ? this.x2 : r.x2,
            (this.y2 > r.y2) ? this.y2 : r.y2
        );
    }

    /* Perpotongan 2 persegi panjang */
    public Rect intersect(Rect r){
        Rect res = new Rect
        (
            (this.x1 > r.x1) ? this.x1 : r.x1,
            (this.y1 > r.y1) ? this.y1 : r.y1,
            (this.x2 < r.x2) ? this.x2 : r.x2,
            (this.y2 < r.y2) ? this.y2 : r.y2
        );
        if (res.x1 > res.x2)res.x1 = res.x2 = 0;
        if (res.y1 > res.y2)res.y1 = res.y2 = 0;
        return res;
    }
}
