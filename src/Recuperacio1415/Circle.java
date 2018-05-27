package Recuperacio1415;

public class Circle extends Figure {
    private final double r;
    public Circle(double x, double y, double r){
        super(x,y);
        this.r = r;
    }

    public double getR() {
        return r;
    }
}
