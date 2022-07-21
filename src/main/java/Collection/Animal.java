package Collection;

import java.util.Comparator;

public class Animal implements Comparable { //можно привести к <Animal> чтобы впоследствии не приводить значения к типу
    String breed;
    int price;
    int speed;
    int weight;

    public Animal(String breed, int price, int speed, int weight) {
        this.breed = breed;
        this.price = price;
        this.speed = speed;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Object o) {
//        int tmp = this.speed - ((Animal) o).speed; Сортировка по не скольким параметрам
//
//        if (tmp == 0) {
//            return this.price - ((Animal) o).price;
//        } else {
//            return tmp;
        return this.breed.compareTo(((Animal) o).breed); //сортировка по 1 параметру
    }
}

class ComparatorPrice implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).price - ((Animal) o2).price;
    }
}

class ComparatorSpeed implements Comparator {
    public int compare(Object o1, Object o2) {
        return ((Animal) o1).speed - ((Animal) o2).speed;
    }
}