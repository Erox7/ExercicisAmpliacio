package Recuperacio1213.Problema1;

public class Circle extends Figure {
    private double r;

    public Circle(double x, double y, double r) {
        super(x, y);
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        if(this.r != r) {
            this.r = r;
            c.setChanged();
            c.notifyObservers();
        }
    }
}
