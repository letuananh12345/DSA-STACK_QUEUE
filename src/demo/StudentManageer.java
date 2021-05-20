package demo;

import java.util.ArrayList;

public class StudentManageer {
    ArrayList<Student>  student= null; // = new ArrayList<>();

    public StudentManageer() {
       student= new ArrayList<>();
       student.add(new Student("Tu",20)); // tao 1 list sẵn
       student.add(new Student("Thanh",26));
       student.add(new Student("Oanh",18));
       student.add(new Student("Oanh",16));
    }

    public StudentManageer(ArrayList<Student> student) {
        this.student = student;
    }
    void disPlay(){
        for (Student s:student) {
            System.out.println(s.toString());
        }

        }
}
