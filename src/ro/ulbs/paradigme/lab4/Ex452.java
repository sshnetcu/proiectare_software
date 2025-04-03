package ro.ulbs.paradigme.lab4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex452 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("George Popescu", "223_1"));
        list.add(new Student("Maria Popa", "223_2"));
        list.add(new Student("Marius Ionescu", "223_1"));
        list.add(new Student("Diana Oprea", "223_2"));
        list.add(new Student("Ion Popescu", "223_3"));
        list.add(new Student("Elena Dragomir", "223_1"));
    }
}
