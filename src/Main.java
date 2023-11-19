import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        GeometryObject[] figures = new GeometryObject[]{new Circle(9), new Triangle(23, 76), new Rectangular(2, 3), new Triangle(3434, 2323)};
        Arrays.sort(figures);
        System.out.println(Arrays.toString(figures));
    }
}