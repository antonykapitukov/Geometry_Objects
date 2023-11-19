public abstract class GeometryObject implements Comparable<GeometryObject> {
    double area;

    abstract void getArea();

    @Override
    public int compareTo(GeometryObject o) {
        if (o.area < this.area) {
            return 1;
        } else if (o.area > this.area) {
            return -1;
        }
            return 0;

    }
}
