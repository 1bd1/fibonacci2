public class fibonacci2 {


    public static void main(String[] args) {
        int a = 1;
        long runMethodBelow = fibonaccihoPostupnost(a);
    }


    public static int b = 1;
    public static int c = 0;


    public static long fibonaccihoPostupnost(int a) {

        switch (a) {
            case 1:
                b = 1;
                c = b;
                break;

            default:
                c = b;
                b = a;
                break;
        }


        if (a > 100) {
            return a;
        } else {
            System.out.println("Králikov= " + a);

            return fibonaccihoPostupnost(a = a + c);

        }

    }

}



