package SegonParcial1617_Ex3;

import java.util.HashMap;
import java.util.List;

public class Register {
    private static Register register;
    private HashMap<String, MachineComponent> components = new HashMap<>();

    public static Register getRegister(){
        if(register == null){
            register = new Register();
        }
        return register;
    }

    public void addComponent(String name, MachineComponent mc){
        components.put(name,mc);
    }

    public MachineComponent getComponent(String name){
        return components.get(name);
    }
}
