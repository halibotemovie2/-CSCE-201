public class Shape {
    public Shape() {

    }

    public double getArea() {
        return 0;
    }
}

public class Rectangle extends Shape {
    private double width, height;

    public Rectangle(){
        width=0;
        height=0;
    }
    public Rectangle(double w, double h){
        width=w;
        height=h;
    }

    @Override
    public double getArea(){
        return width*height;
    }

}

public class Circle extends Shape{
    private double r;
    public Circle(){
        r=0;
    }

    public Circle(double r){
        this.r=r;
    }
    @Override
    public double getArea(){
        return Math.PI*r*r;
    }

}