package SegonParcial1516_Ex1i2;

public abstract class GenericVisitor implements  ComponentVisitor{
    protected int counter;

    @Override
    public void visit(Leaf leaf) {
        if(!leaf.isVisited) {
            visitOperation(leaf);
        }
    }

    @Override
    public void visit(Composite composite) {
        for(Component c : composite.getComponents()){
            if(!c.isVisited) {
                c.accept(this);
            }
        }
    }

    public int getCounter(){
        return this.counter;
    }

    public abstract void visitOperation(Leaf leaf);
}