package WorkWithFiles.programmer1;

import java.io.Serializable;

public class Emloyees implements Serializable {
    String name;
    String department;
    int age;

    public Emloyees(String name, String department, int age, double salary) {
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emloyees{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    double salary;
}
