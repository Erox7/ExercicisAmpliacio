package SegonParcial1516.SegonParcial1516_Ex1i2;

public class SumVisitorv2 extends GenericVisitor {
    @Override
    public void visitOperation(Leaf l) {
        this.counter += l.getInfo();
    }
}
