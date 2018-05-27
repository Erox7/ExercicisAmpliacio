package Recuperacio1213.Problema1;

import Recuperacio1213.Problema2.FigureBuilder;

public class Figure{
    private double x,y;
    protected CustomObservable c;
    public Figure(double x, double y){
        this.x = x;
        this.y = y;
        this.c = new CustomObservable();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        if(this.x != x) {
            this.x = x;
            c.setChanged();
            c.notifyObservers();
        }
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        if(this.y != y) {
            this.y = y;
            c.setChanged();
            c.notifyObservers();
        }
    }
    public FigureBuilder create(){
        return new FigureBuilder();
    }
}
