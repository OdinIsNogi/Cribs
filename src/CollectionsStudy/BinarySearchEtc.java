package CollectionsStudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class BinarySearchEtc {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "A", 10620);
        Employee e2 = new Employee(15, "B", 1045260);
        Employee e3 = new Employee(123, "C", 100);
        Employee e4 = new Employee(15, "D", 5100);
        Employee e5 = new Employee(182, "E", 10560);
        Employee e6 = new Employee(15, "F", 12300);
        Employee e7 = new Employee(250, "G", 1010);
        List<Employee> list = new ArrayList<>();
        Stream.of(e1, e2, e3, e4, e4, e5, e6, e7).forEach(list::add);
        Collections.sort(list);
        int index = Collections.binarySearch(list, new Employee(15, "B", 1045260));
        System.out.println(index);

    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    int salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}