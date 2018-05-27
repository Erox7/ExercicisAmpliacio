package SegonParcial1516_Ex3;

public class FigureBuilder {
    private double x,y,width,height,radius;
    private boolean hasDimensions, hasRadius,firstAt;

    public FigureBuilder(){
        this.firstAt = true;
    }

    public FigureBuilder at(double x, double y){
        if(firstAt) {
            this.x = x;
            this.y = y;
            firstAt = false;
        }
        return this;
    }

    public FigureBuilder withDimensions(double width, double height){
        if(!hasRadius) {
            this.width = width;
            this.height = height;
            this.hasDimensions = true;
            return this;
        }else{
            throw new IllegalStateException();
        }
    }

    public FigureBuilder withRadius(double radius){
        if(!hasDimensions) {
            this.radius = radius;
            this.hasRadius = true;
            return this;
        }else{
            throw new IllegalStateException();
        }
    }

    public Figure execute(){
        if (firstAt){
            throw new IllegalStateException();
        }
        if (hasDimensions){
            return new Rectangle(this.x,this.y,this.width,this.height);
        } else if (hasRadius){
            return new Circle(this.x,this.y,this.radius);
        } else {
            throw new IllegalStateException();
        }
    }
}
