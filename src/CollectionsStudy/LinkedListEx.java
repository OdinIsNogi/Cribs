package CollectionsStudy;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        Student s1 = new Student("A", 3);
        Student s2 = new Student("B", 2);
        Student s3 = new Student("C", 1);
        Student s4 = new Student("D", 4);
        Student s5 = new Student("I", 3);
        Student s6 = new Student("F", 3);
        Student s7 = new Student("G", 3);

        LinkedList<Student> studentLinkedList = new LinkedList<>();
        studentLinkedList.add(s1);
        studentLinkedList.add(s2);
        studentLinkedList.add(s3);
        studentLinkedList.add(s4);
        studentLinkedList.add(s5);
        studentLinkedList.add(s6);
        System.out.println(studentLinkedList);
    }
}

class Student {
    int course;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                "}\n";
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }
}