public class Triangle  extends GeometryObject{
    int a, h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
        getArea();
    }

    @Override
    void getArea() {
        this.area = 0.5 * a * h;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", h=" + h +
                ", area=" + area +
                '}';
    }
}
