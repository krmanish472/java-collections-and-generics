package CollectionAndGenerics.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceApp {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, 98));
        students.add(new Student(101, 55));
        students.add(new Student(101, 38));
        students.add(new Student(101, 100));
        students.add(new Student(101, 70));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
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

    @Override
    public int compareTo(Student o) {
        return this.marks > o.marks ? -1 : (this.marks < o.marks ? 1 : 0);
    }
}