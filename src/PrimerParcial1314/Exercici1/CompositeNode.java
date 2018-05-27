package PrimerParcial1314.Exercici1;

import java.util.ArrayList;
import java.util.List;

public class CompositeNode extends DiskTreeNode {

    @Override
    public void operation() {

    }

    @Override
    public void accept(TreeVisitor tr) {
        for(DiskTreeNode dtn : this.getChildren()){
            dtn.accept(tr);
        }
    }

    private List<DiskTreeNode> getChildren(){
        return new ArrayList<>();
    }
}
