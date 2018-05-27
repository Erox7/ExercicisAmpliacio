package Recuperacio1314;

import java.util.Set;

public class NoValue extends MaybeValue {
    public static final Expression INSTANCE = null;

    @Override
    public boolean hasValue() {
        return false;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public MaybeValue evaluate() {
        return null;
    }

    @Override
    public Set<Cell> references() {
        return null;
    }
}
