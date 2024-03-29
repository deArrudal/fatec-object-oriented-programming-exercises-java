package view;

public class Test {
    public static void main(String[] args) {
        System.out.println("Start of Main");

        try {
            method1();
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic error");
        } catch (IndexOutOfBoundsException indexException) {
            System.out.println("Index out of bounds");
        }

        System.out.println("End of Main");
    }

    public static void method1() throws ArithmeticException, IndexOutOfBoundsException {
        System.out.println("Start of Method 1");

        method2();

        System.out.println("End of Method 1");
    }

    public static void method2() throws ArithmeticException, IndexOutOfBoundsException {
        System.out.println("Start of Method 2");
        int[] array = new int[10];

        for (int i = 0; i <= 15; i++) {
            array[i] = i;
            System.out.println(i);

            if (i == 9) {
                // comment to test the outofboundsexception
                int value = array[i] / array[0];
                System.out.println(value);
            }
        }

        System.out.println("End of Method 2");
    }

}