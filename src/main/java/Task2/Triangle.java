package Task2;
import java.lang.Math;

public class Triangle implements Geometry {
    int a;
    int b;
    int c;
    String colorBorder;
    String colorFill;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Triangle(int a, int b, int c, String colorBorder, String colorFill){
        this.a = a;
        this.b = b;
        this.c = c;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    public void info(){
        System.out.println("Треугольник со сторонами " + a + ", " + b + " и " + c
                + " с цветом контура - " + colorBorder + " и цветом заливки - " + colorFill);
    }

    @Override
    public float findPerimeter() {
        return (a + b + c);
    }

    @Override
    public float findArea() {
        float p = findPerimeter()/2;
        return (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        Triangle ABC = new Triangle(9,10,17, "black", "white");
        ABC.info();
        System.out.println("P = " + ABC.findPerimeter());
        System.out.println("S = " + ABC.findArea());
    }
}
