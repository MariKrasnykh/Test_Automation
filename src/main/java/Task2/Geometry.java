package Task2;

public interface Geometry {
    default float findPerimeter() {
        return 0;
    }
    float findArea();

}
