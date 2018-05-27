package Recuperacio1415;

import java.util.Collections;
import java.util.List;

public class Drawing extends Figure{
    private final List<Figure> figures;

    public Drawing(double x, double y, List<Figure> figures){
        super(x,y);
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return Collections.unmodifiableList(figures);
    }

    public void accept(FigureVisitor fv){
        fv.visit(this);
    }
}
