package SegonParcial1516_Ex3;

public abstract class Figure {
    protected double x,y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static FigureBuilder create(){
        return new FigureBuilder();
    }
}
