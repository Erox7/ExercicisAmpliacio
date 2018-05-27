package SegonParcial1516.SegonParcial1516_Ex1i2;

public class SumVisitor implements  ComponentVisitor{
    private int counter;

    @Override
    public void visit(Leaf leaf) {
        if(!leaf.isVisited) {
            counter += leaf.getInfo();
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
}

