package Comporation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        Employee e1 = new Employee(1, "A", "1", 52100);
        Employee e2 = new Employee(3, "B", "2", 10000);
        Employee e3 = new Employee(2, "C", "3", 4000);
        Stream.of(e1, e2, e3).forEach(l -> list.add(l));
        Collections.sort(list, new salaryComparator());
        System.out.println(list);
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String subName;
    int salary;

    public Employee(int id, String name, String subName, int salary) {
        this.id = id;
        this.name = name;
        this.subName = subName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", mame='" + name + '\'' +
                ", subName='" + subName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        if (this.id == o.id) {
            return 0;
        } else if (this.id < o.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

//сверху стандарт для сравнения по id, снизу дополнительные сортировки по другим параметрам
// (чтобы их запустить укажите вторым параметром в методе sort) ex. Collections.sort(list, new salaryComparator());

class idComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.id == o2.id) {
            return 0;
        } else if (o1.id < o2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}

class nameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class salaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}