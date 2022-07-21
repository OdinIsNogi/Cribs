package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExFlatMap {
    public static void main(String[] args) {
        Student s1 = new Student("A", 'm', 22, 3, 8.3);
        Student s2 = new Student("C", 'f', 28, 2, 6.4);
        Student s3 = new Student("B", 'm', 18, 1, 8.3);
        Student s4 = new Student("F", 'm', 35, 4, 8.0);
        Student s5 = new Student("D", 'f', 23, 3, 7.9);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Mathematics");
        Stream.of(s1,s2,s3).forEach(f1::addStudent);
        Stream.of(s4,s5).forEach(f2::addStudent);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(f1);
        faculties.add(f2);

        faculties.stream().flatMap(faculty -> faculty.getStudentList().stream()).forEach(student -> System.out.println(student.getName()));

    }
}

class Faculty {
    String name;
    List<Student> studentList;

    public List<Student> getStudentList() {
        return studentList;
    }

    public Faculty(String name) {
        studentList = new ArrayList<>();
        this.name = name;
    }
public void addStudent(Student st) {
        studentList.add(st);
}

}
