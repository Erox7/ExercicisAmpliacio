package SegonParcial1617_Ex3;


import sun.security.smartcardio.SunPCSC;

import java.util.HashMap;

public class RegisterEager {
    private static final Register INSTANCE = new Register();
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
