package Task2;

public class Rectangle implements Geometry {
    float a;
    float b;
    String colorBorder;
    String colorFill;


    public Rectangle(float a, float b){
        this.a = a;
        this.b = b;
    }
    public Rectangle(float a, float b, String colorBorder, String colorFill){
        this.a = a;
        this.b = b;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    public void info(){
        System.out.println("Прямоугольник со сторонами " + a + " и " + b
                + " с цветом контура - " + colorBorder + " и цветом заливки - " + colorFill);
    }

    @Override
    public float findPerimeter() {
        return (2*(a + b));
    }

    @Override
    public float findArea() {
        return (a * b);
    }

    public static void main(String[] args) {
        Rectangle ABCD = new Rectangle(4,3.4f, "red", "red");
        ABCD.info();
        System.out.println("P = " + ABCD.findPerimeter());
        System.out.println("S = " + ABCD.findArea());
    }
}
