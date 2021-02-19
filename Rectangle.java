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
