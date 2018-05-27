package Recuperacio1415;

public interface FigureVisitor {
    void visit(Drawing d);
    void visit(Circle c);
    void visit(Rectangle r);
}
