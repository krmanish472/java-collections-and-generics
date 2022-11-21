package CollectionAndGenerics.ComparatorInterface;

import java.util.ArrayList;
import java.util.List;

public class ComparatorWithCustomTypes {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, 98));
        students.add(new Student(101, 55));
        students.add(new Student(101, 38));
        students.add(new Student(101, 100));
        students.add(new Student(101, 70));

        // descending
        students.sort((s1, s2) -> Integer.compare(s2.marks, s1.marks));

        // ascending
        // students.sort(Comparator.comparingInt(s -> s.marks));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student {
    int rollno;
    int marks;

    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }
}
