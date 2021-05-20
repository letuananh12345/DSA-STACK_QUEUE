package demo2;

import demo.Student;

import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        StudentManageer sm = new StudentManageer();
            //ứng với trường hợp StudentManageer implement Caparator(ứng với dịnh nghĩa 1 loại <name> ) :
//        Collections.sort(sm.student);
//        sm.disPlay();
        // ứng với trường hợp muốn so2 nhiều loại => tạo ẩn danh new Camparator bên này
        Collections.sort(sm.student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }

        });
        sm.disPlay();
        System.out.println("sap xếp theo tuổi : ");
        Collections.sort(sm.student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        sm.disPlay();

    }
}
