package Recuperacio1213.Problema1;

public class Line extends Figure {
    private double x2,y2;
    public Line(double x, double y, double x2, double y2) {
        super(x, y);
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }
}
