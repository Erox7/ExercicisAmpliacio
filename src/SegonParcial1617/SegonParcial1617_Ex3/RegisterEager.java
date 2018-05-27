package SegonParcial1617.SegonParcial1617_Ex3;


import java.util.HashMap;

public class RegisterEager {
    private static final RegisterEager INSTANCE = new RegisterEager();
    private HashMap<String, MachineComponent> components;

    private RegisterEager(){
        components = new HashMap<>();
    }

    public void addComponent(String name, MachineComponent mc){
        components.put(name,mc);
    }

    public MachineComponent getComponent(String name){
        return components.get(name);
    }
}
