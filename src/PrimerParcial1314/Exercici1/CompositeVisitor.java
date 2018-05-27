package PrimerParcial1314.Exercici1;


import java.util.List;
//Patro observador, per poder fer la operació de diversos visitors a la vegada.
public class CompositeVisitor implements TreeVisitor{
    private List<TreeVisitor> visitors;

    public CompositeVisitor(List<TreeVisitor> visitors){
        this.visitors = visitors;
    }
    @Override
    public void visit(LeafNode ln) {
        for(TreeVisitor tv : visitors){
            tv.visit(ln);
        }
    }

    @Override
    public void visit(CompositeNode cn) {
        for(TreeVisitor tv : visitors){
            tv.visit(cn);
        }
    }
}
