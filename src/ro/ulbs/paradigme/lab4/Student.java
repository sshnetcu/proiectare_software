package ro.ulbs.paradigme.lab4;

public class Student {
    String namesurname;
    String group;
    float[] grades;

    public Student(String namesurname, String group) {
        this.namesurname = namesurname;
        this.group = group;
        this.assignGrades();
    }
    private void assignGrades() {
        grades = new float[5];
        for (int i = 0; i < 5; i++) {
            grades[i] = (float) (Math.random() * 6) + 4;
        }
    }

    public String getName() {
        return namesurname;
    }

    @Override
    public String toString() {
        return String.format("%s (%s)", namesurname, group);
    }

    public boolean isIntegral() {
        for (float i : grades) {
            if (i <= 4.5) {
                return false;
            }
        }
        return true;
    }

    public float getMedie() {
        float m = 0;
        for (float i : grades) {
            m += i;
        }
        return m/5;
    }

    public int getRestante() {
        int m = 0;
        for (float i : grades) {
            if (i < 4.5) {
                m++;
            }
        }
        return m;
    }
}
