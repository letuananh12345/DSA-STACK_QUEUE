package demo2;

import demo.Student;

import java.util.ArrayList;
import java.util.Comparator;

public class StudentManageer{ //implements Comparator<Student> {
    ArrayList<demo.Student>  student= null; // = new ArrayList<>();

    public StudentManageer() {
       student= new ArrayList<>();
       student.add(new demo.Student("Tu",20)); // tao 1 list sẵn
       student.add(new demo.Student("Thanh",26));
       student.add(new demo.Student("Oanh",18));
       student.add(new demo.Student("Oanh",16));
    }

    public StudentManageer(ArrayList<demo.Student> student) {
        this.student = student;
    }
    void disPlay(){
        for (Student s:student) {
            System.out.println(s.toString());
        }


        }
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.getName().compareTo(o2.getName());
//    // thường chỉ lấy đc 1 tiêu chí name or age => override thao hình thức ẩn  danh bên Main
//    }
}
