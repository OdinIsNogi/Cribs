package Streams;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex2Filter {
    public static void main(String[] args) {
        Student s1 = new Student("A", 'm', 22, 3, 8.3);
        Student s2 = new Student("C", 'f', 28, 2, 6.4);
        Student s3 = new Student("B", 'm', 18, 1, 8.3);
        Student s4 = new Student("F", 'm', 35, 4, 8.0);
        Student s5 = new Student("D", 'f', 23, 3, 7.9);

        List<Student> students = Stream.of(s1, s2, s3, s4, s5).collect(Collectors.toList());
        //фильтрация результатов filter возвращает boolean

//Процесс сортировки
        List<Student> st = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());

        students = students.stream().filter(e -> e.getAge() > 22 && e.getAvgGrade() < 7.2).collect(Collectors.toList());

        students.stream().map(e ->{e.setName(e.getName().toLowerCase(Locale.ROOT)); return e;})
                .filter(sex->sex.getSex()=='f').sorted(Comparator.comparing(Student::getAge).reversed())
                .forEach(System.out::println);
    }
}


class Student {
    private String name;
    private char sex;
    private int age;
    private int course;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    private double avgGrade;

    @Override
    public String toString() {
        return name;
    }
}