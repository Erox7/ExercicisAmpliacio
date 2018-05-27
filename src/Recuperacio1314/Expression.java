package Recuperacio1314;

import javafx.beans.Observable;
import java.util.Set;

public interface Expression extends Observable{
    MaybeValue evaluate();
    Set<Cell> references();
}
