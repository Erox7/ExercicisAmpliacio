package Recuperacio1314;

import java.util.Set;

public class SomeValue extends MaybeValue {
    private final int value;
    private final boolean boolValue;

    public SomeValue(int i){
        this.value = i;
        this.boolValue = true;
    }
    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public MaybeValue evaluate() {
        return null;
    }

    @Override
    public Set<Cell> references() {
        return null;
    }

    public int getValue(){
        return value;
    }
}
