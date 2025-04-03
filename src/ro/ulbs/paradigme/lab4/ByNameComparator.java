package ro.ulbs.paradigme.lab4;

import java.util.Comparator;

public class ByNameComparator implements Comparator<Student> {
    public int compare(Student o1, Student o2) {
        for (char i : o1.getName().toCharArray()) {
            if (o1.getName().charAt(i) < o2.getName().charAt(i)) {
                return 1;
            } else if (o1.getName().charAt(i) > o2.getName().charAt(i)) {
                return -1;
            }
        }
        return 0;
    }
}
