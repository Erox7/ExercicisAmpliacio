package Recuperacio1314;

public abstract class Operation {
    Expression e1, e2;
    public Operation(Expression e1, Expression e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    public abstract int operate(int i1, int i2);

}
