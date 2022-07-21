package AbstractAndInterface;

public class Interface {
    public static void main(String[] args) {
    Driver d = new Driver(1.1,1,1);
    d.name = "A";
d.eat();


    }

    public Interface(double salary, int age, int experience) {
        this.salary = salary;
        this.age = age;
        this.experience = experience;
    }

    double salary;
    int age;
    int experience;

    void eat() {
        System.out.println("eat");
    }

    void sleep() {
        System.out.println("sleep");
    }
}

class Teacher extends Interface implements help {
    int students;

    public Teacher(double salary, int age, int experience) {
        super(salary, age, experience);
    }

    void teach() {
        System.out.println("teach");
    }

    @Override
    public void firstAid() {
        System.out.println("can help");
    }

    @Override
    public void fire() {
        System.out.println("fire");
    }
}

class Driver extends Interface implements help, swim {
    String name;

    public Driver(double salary, int age, int experience) {
        super(salary, age, experience);
    }

    void drive() {
        System.out.println("drive");
    }

    @Override
    public void firstAid() {
        System.out.println("can help");
    }

    @Override
    public void fire() {
        System.out.println("fire");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}

interface help { void firstAid();void fire();}

interface swim { void swim();}