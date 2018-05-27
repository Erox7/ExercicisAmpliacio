package Recuperacio1415;

public class Rectangle extends Figure {
    private final double width, height;

    public Rectangle(double x, double y, double width, double height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
