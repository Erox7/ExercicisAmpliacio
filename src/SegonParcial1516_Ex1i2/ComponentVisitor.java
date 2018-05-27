package SegonParcial1516_Ex1i2;

public interface ComponentVisitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
