package PrimerParcial1415.Exercici1;

import java.util.List;

public class Group {
    private List<Student> students;

    public Group(List<Student> students){
        this.students = students;
    }

    public void addStudent(Student s){
        students.add(s);
    }
    public int numStudents(){
        return students.size();
    }

    public Student getStudent(int id){
        return students.stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .get();

    }
}
