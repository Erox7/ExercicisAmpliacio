package Recuperacio1415;

import java.util.List;

public class DrawingBuilder{
    private double x,y;
    private List<Figure> figures;

    public DrawingBuilder setCoords(double x, double y){
        this.x = x;
        this.y = y;
        return this;
    }

    public DrawingBuilder addFigure(Figure figure){
        figures.add(figure);
        return this;
    }

    public Drawing createDrawing(){
        return new Drawing(this.x, this.y, figures);
    }
}
