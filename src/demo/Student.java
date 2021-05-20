package demo;

public class Student implements Comparable<Student> {
    private  String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student student) {
       // return this.getName().compareTo(student.getName());// sap xep theo ten
        //return this.getAge()-student.getAge(); sap xep theo tuoi
    //neu ten trung nhau = sap sep theo tuoi:
        if (this.getName().compareTo(student.getName())==0)
           return this.getAge()-student.getAge();
        return this.getName().compareTo(student.getName());


    }
}
