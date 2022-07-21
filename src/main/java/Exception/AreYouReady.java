package Exception;

public class AreYouReady {
    public static void main(String[] args) {
        int result = division(55, 0);
        System.out.println(result);
    }

    public static int division(int a, int b) {
//        if (b == 0) {
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));) {
//                System.out.println("Please put another number");
//                b = Integer.parseInt(reader.readLine());
//            } catch (IOException e) {
//                System.err.println("IIOException");
//            }
//        }
//        return a / b;
        if (b == 0)
            try {
                try {
                    try {
                        try {
                            throw new Exception("Zero");

                        } catch (Exception e) {
                            System.err.println("lvl 4");
                        }
                        throw new Exception("Zero");

                    } catch (Exception e) {
                        System.err.println("lvl 3");
                    }
                    throw new Exception("Zero");

                } catch (Exception e) {
                    System.err.println("lvl 2");
                }
                throw new Exception("Zero");

            } catch (Exception e) {
                System.err.println("lvl 1");
            }
        return a / b;
    }
}
