package Exception;

public class ProductMain {
    public static void main(String[] args) {


    }

    public static<T extends Product & Comparable<T>> void getPrice(T product) {
        System.out.println(product.getPrice());
    }
}
