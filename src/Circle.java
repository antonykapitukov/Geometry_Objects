public class Circle extends GeometryObject{
    int radius;


    public Circle(int radius) {
        this.radius = radius;
        getArea();
    }
    @Override
    void getArea() {
        this.area = Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                '}';
    }
}
