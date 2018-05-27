package SegonParcial1516.SegonParcial1516_Ex1i2;

public abstract class Component {
    protected boolean isVisited;
    abstract void accept(ComponentVisitor countVisitor);

    public Component(){
        this.isVisited = false;
    }
}
