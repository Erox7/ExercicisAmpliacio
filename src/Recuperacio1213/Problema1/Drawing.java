package Recuperacio1213.Problema1;

import java.util.List;

public class Drawing extends Figure{
    private List<Figure> figures;

    public Drawing(double x, double y, List<Figure> figures){
        super(x,y);
        this.figures = figures;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }
}
