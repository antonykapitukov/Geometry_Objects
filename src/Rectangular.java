public class Rectangular extends GeometryObject{
    int a, b;
    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
        getArea();
    }

    @Override
    void getArea() {
        this.area = a * b;
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "a=" + a +
                ", b=" + b +
                ", area=" + area +
                '}';
    }
}
