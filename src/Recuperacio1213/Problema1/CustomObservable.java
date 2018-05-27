package Recuperacio1213.Problema1;

import java.util.Observable;
import java.util.Observer;

public class CustomObservable extends Observable{

    @Override
    public void setChanged(){
        super.setChanged();
    }

    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o);
    }

    @Override
    public void notifyObservers() {
        super.notifyObservers();
    }

    @Override
    public void notifyObservers(Object arg) {
        super.notifyObservers(arg);
    }
}
