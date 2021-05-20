package demo;

import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        StudentManageer smama=new StudentManageer();
        smama.disPlay();
        System.out.println("sap xep theo ten");
        /// ap dung comparable : elemnt Compaable
        Collections.sort(smama.student);
        smama.disPlay();
    }
}
