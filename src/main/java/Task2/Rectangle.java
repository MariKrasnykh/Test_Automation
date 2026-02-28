package Task2;

public class Rectangle implements Geometry, IColorable, IOutputable {
    float a;
    float b;
    String colorBorder;
    String colorFill;

   static float perimetr;
   static float area;

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

    @Override
    public void setColorBorder(String colorBorder) {
        this.colorBorder = colorBorder;
    }

    @Override
    public void setColorFill(String colorFill) {
        this.colorFill = colorFill;
    }

    @Override
    public void printResult() {
        System.out.println("P = " + perimetr + ", S = " + area + ", цвет контура - " + colorBorder + ", цвет заливки - " + colorFill);

    }


    public static void main(String[] args) {
        Rectangle ABCD = new Rectangle(4,3.4f);
        ABCD.setColorBorder("red");
        ABCD.setColorFill("red");
        ABCD.info();
        area = ABCD.findArea();
        perimetr = ABCD.findPerimeter();
        ABCD.printResult();

    }



}
