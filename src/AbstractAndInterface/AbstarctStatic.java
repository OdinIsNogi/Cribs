package AbstractAndInterface;

public class AbstarctStatic {
    public static void main(String[] args) {
        Figure f1 = new XXX(4);
        f1.ploshad();
        System.out.println(f1.storoni);
    }
}

class XXX extends Kvadrat{
    public XXX(int s) {
        super(s);
    }
}

abstract class Figure {
    int storoni = 0;

    abstract void perimetr();

    abstract void ploshad();

    void show() {
        System.out.println("Figure: ");
    }
}

class Kvadrat extends Figure {
    int s;

    public Kvadrat(int s) {
        this.s = s;
    }


    @Override
    void perimetr() {
        System.out.println(s * 4);
    }

    @Override
    void ploshad() {
        System.out.println(s * s);
    }
}

class Pr9mygolnik extends Figure {
    int s;
    int a;
    int b;

    public Pr9mygolnik(int s, int a, int b) {
        this.s = s;
        this.a = a;
        this.b = b;
    }


    @Override
    void perimetr() {
        System.out.println(2 * (a + b));
    }

    @Override
    void ploshad() {
        System.out.println(a * b);
    }
}

class Kryg extends Figure {
    int s = 0;
    int radius = 2;

    public Kryg(int s, int radius) {
        this.s = s;
        this.radius = radius;
    }


    @Override
    void perimetr() {
        System.out.println(2 * 3.14 * radius);
    }

    @Override
    void ploshad() {
        System.out.println(3.14 * radius * radius);
    }
}

abstract class A extends Figure {
    void def() {
        System.out.println("A");
    }
}