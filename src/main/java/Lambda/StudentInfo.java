package main.java.Lambda;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StudentInfo {
    void testStudent(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

    static class Test {
        public static void main(String[] args) {
            Student s1 = new Student("A", 'm', 22, 3, 8.3);
            Student s2 = new Student("B", 'm', 28, 2, 5.3);
            Student s3 = new Student("C", 'm', 13, 1, 7.3);
            Student s4 = new Student("D", 'm', 45, 5, 9.3);
            Student s5 = new Student("I", 'm', 70, 4, 7.1);

            ArrayList<Student> students = new ArrayList<>();
            Stream.of(s1, s2, s3, s4, s5).forEach(students::add);

            StudentInfo studentInfo = new StudentInfo();
             
            studentInfo.testStudent(students, s -> s.age < 30);
            System.out.println("--------");
            studentInfo.testStudent(students, s -> s.avgGrade < 8 && s.age > 40);

        }
    }

    static class OverGradeCheck implements StudentChecks {

        @Override
        public boolean check(Student s) {
            return s.avgGrade > 8;
        }
    }
}


//    void OverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void UnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void mixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age > age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }
//}
