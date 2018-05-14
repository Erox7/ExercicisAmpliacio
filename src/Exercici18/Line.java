package Exercici18;

public class Line extends Figure {
    public int x,y;

    public Line(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public LineInteract createInteract() {
        return new LineInteract(this);
    }
}
