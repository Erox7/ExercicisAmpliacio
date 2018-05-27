package SegonParcial1516_Ex1i2;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Composite extends Component {
    private UnmodifiableArrayList<Component> components;

    public Composite(UnmodifiableArrayList components){
        super();
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void setVisited(){
        this.isVisited = true;
    }

    public void accept(ComponentVisitor c) {
        c.visit(this);
    }

}
