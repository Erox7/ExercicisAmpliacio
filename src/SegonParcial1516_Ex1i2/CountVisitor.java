package SegonParcial1516_Ex1i2;

public class CountVisitor implements  ComponentVisitor{
    private int counter;

    @Override
    public void visit(Leaf leaf) {
        counter += 1;
    }

    @Override
    public void visit(Composite composite) {
        for(Component c : composite.getComponents()){
            c.accept(this);
        }
    }

    public int getCounter(){
        return this.counter;
    }
}
