package PrimerParcial1314.Exercici1;

public class LeafNode extends DiskTreeNode {
    @Override
    public void operation() {

    }

    @Override
    public void accept(TreeVisitor tr) {
        tr.visit(this);
    }
}
