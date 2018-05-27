package PrimerParcial1415.Exercici1;

public class Student {
    private long id;
    private String name;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
}
