package SegonParcial1516_Ex1i2;

public class Leaf extends Component {
    private int info;

    public Leaf(int info){
        super();
        this.info = info;
    }

    public int getInfo() {
        return info;
    }

    public void accept(ComponentVisitor c) {
        c.visit(this);
    }
}
