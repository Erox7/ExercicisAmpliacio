package Recuperacio1415;
import java.util.List;

public class AreaDoubler implements FigureVisitor{
    private List<Figure> finalFigures;
    @Override
    public void visit(Drawing d) {
        DrawingBuilder db = new DrawingBuilder();
        db.setCoords(d.getX(),d.getY());
        for(Figure f : d.getFigures()){
            f.accept(this);
        }
    }

    @Override
    public void visit(Circle c) {
        finalFigures.add(new Circle(c.getX(),c.getY(),c.getR()* Math.sqrt(2.0)));
    }

    @Override
    public void visit(Rectangle r) {
        finalFigures.add(new Rectangle(r.getX(),r.getY(),
                r.getWidth()* Math.sqrt(2.0),r.getHeight()* Math.sqrt(2.0)));
    }
}
