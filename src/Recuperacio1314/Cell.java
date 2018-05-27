package Recuperacio1314;

import java.util.Observable;
import java.util.Observer;

public class Cell implements Observer {
    private Expression exp;
    private MaybeValue val;

    public Cell(){
        this.exp = NoValue.INSTANCE;
        this.val = exp.evaluate();
    }

    public void set(Expression exp){

        this.exp = exp;
        this.val = exp.evaluate();
    }

    public MaybeValue evaluate(){
        return this.val;
    }

    @Override
    public void update(Observable o, Object arg) {
        Expression exp = (Expression) o;
        this.exp = exp;
        this.val = exp.evaluate();
    }
}
