package SegonParcial1617_Ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MachineComposite extends MachineComponent implements Observer {

    private List<MachineComponent> components;
    protected Observable o;

    public MachineComposite(long id){
        super(id);
        components = new ArrayList<>();
        o = new Observable();
    }

    public void addComponent(MachineComponent mc){
        components.add(mc);
        if(mc instanceof MachineComposite){
            ((MachineComposite) mc).getObservable().addObserver(this);
        }
        o.setChanged();
        o.notifyObservers(this.getId());
    }

    public Observable getObservable() {
        return o;
    }

    @Override
    public void update(Observable o, Object arg) {

        if(this.o.countObservers() > 0){
            o.setChanged();
            o.notifyObservers(arg);
        } else {
            System.out.println(arg);
        }
    }

}
