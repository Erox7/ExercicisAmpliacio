package SegonParcial1617_Ex3;


import sun.security.smartcardio.SunPCSC;

import java.util.HashMap;

public class RegisterEager {
    private static final Register INSTANCE = new Register();
    private HashMap<String, MachineComponent> components = new HashMap<>();

    private RegisterEager(){
    }

    private void addComponent(String name, MachineComponent mc){
        components.put(name,mc);
    }

    private MachineComponent getComponent(String name){
        return components.get(name);
    }
}
