package SegonParcial1617_Ex2;

public abstract class MachineComponent {
    protected long id;

    public long getId(){
        return this.id;
    };

    public MachineComponent(long id){
        this.id =id;
    }

}
