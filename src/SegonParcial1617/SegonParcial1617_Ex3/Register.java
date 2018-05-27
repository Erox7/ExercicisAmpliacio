package SegonParcial1617.SegonParcial1617_Ex3;

import java.util.HashMap;

public class Register {
    private static Register register;
    private HashMap<String, MachineComponent> components;

    public static Register getRegister(){
        if(register == null){
            register = new Register();
        }
        return register;
    }

    private Register(){
        components = new HashMap<>();
    }
    public void addComponent(String name, MachineComponent mc){
        components.put(name,mc);
    }

    public MachineComponent getComponent(String name){
        return components.get(name);
    }
}
