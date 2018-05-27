package Recuperacio1415;

public abstract class Figure {
    private final double x,y;
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    abstract void accept(FigureVisitor fv);
}
