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
