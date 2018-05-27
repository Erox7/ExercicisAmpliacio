package Recuperacio1213.Problema2;

import Recuperacio1213.Problema1.Circle;
import Recuperacio1213.Problema1.Figure;
import Recuperacio1213.Problema1.Line;

import java.util.List;

public class FigureBuilder {
    private double x,y,r,width,heigh,x2,y2;
    private List<Figure> figures;
    private boolean hasRadius;
    private boolean atPoint;
    private boolean hasDims;
    private boolean from;
    private boolean to;

    public FigureBuilder at(double x, double y){
        this.x = x;
        this.y = y;
        this.atPoint = true;
        return this;
    }
    public FigureBuilder withRadius(double r){
        this.r = r;
        this.hasRadius = true;
        return this;
    }
    public FigureBuilder withDims(double width, double heigh){
        this.width = width;
        this.heigh = heigh;
        this.hasDims = true;
        return this;
    }
    public FigureBuilder from(double x, double y){
        this.x = x;
        this.y = y;
        this.from = true;
        return this;
    }
    public FigureBuilder to(double x2, double y2){
        this.x2 = x2;
        this.y2 = y2;
        this.to = true;
        return this;
    }
    public Figure Do(){
        if((this.from && this.atPoint) || (this.to && (this.hasDims && this.hasRadius))
                || (this.hasDims && (this.to && this.hasRadius))){
            return null;
        }else if(hasRadius){
            return new Circle(this.x,this.y,this.r);
        }else if(this.to){
            return new Line(this.x,this.y, this.x2, this.y2);
        }
        //Create other figures.
        return null;
    }
}
