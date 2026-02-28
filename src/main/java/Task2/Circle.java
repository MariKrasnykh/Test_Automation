package Task2;

public class Circle implements Geometry, IColorable{
    int radius;
    String colorBorder;
    String colorFill;

    public Circle(int radius, String colorBorder, String colorFill){
        this.radius = radius;
        this.colorBorder = colorBorder;
        this.colorFill = colorFill;
    }

    public void info(){
        System.out.println("Круг с радиусом " + radius
                + " и цветом контура - " + colorBorder + ", цветом заливки - " + colorFill);
    }

    @Override
    public void setColorBorder(String colorBorder) {
        this.colorBorder = colorBorder;
    }

    @Override
    public void setColorFill(String colorFill) {
        this.colorFill = colorFill;
    }

    @Override
    public float findPerimeter() {
        throw new UnsupportedOperationException();
    }

    @Override
    public float findArea() {
        final float PI = 3.14f;
        return PI*radius*radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(6,"green", "gray");
        circle.info();
        System.out.println("S = " + circle.findArea());
        System.out.println("P = " + circle.findPerimeter());
    }


}
