import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");

        int [] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double [] fractionalNumbers = {1.57, 7.654, 9.986};

        int [] random = {5, 8, 69, 12, 44, 0, 7, 1};
    }

    public static void task2 () {
        System.out.println("Задача 2");

        int [] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double [] fractionalNumbers = {1.57, 7.654, 9.986};

        int [] random = {5, 8, 69, 12, 44, 0, 7, 1};

        for (int i = 0; i < integer.length; i++) {
            System.out.print(integer[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < fractionalNumbers.length; i++) {
            System.out.print(fractionalNumbers[i] + ", ");
        }

        System.out.println();

        for (int i = 0; i < random.length; i++) {
            System.out.print(random[i] + ", ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");

        int [] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        double [] fractionalNumbers = {1.57, 7.654, 9.986};

        int [] random = {5, 8, 69, 12, 44, 0, 7, 1};

        for (int i = integer.length - 1; i >= 0; i--) {
            System.out.print(integer[i] + ", ");
        }

        System.out.println();

        for (int i = fractionalNumbers.length - 1; i >= 0; i--) {
            System.out.print(fractionalNumbers[i] + ", ");
        }

        System.out.println();

        for (int i = random.length - 1; i >= 0; i--) {
            System.out.print(random[i] + ", ");
        }
        System.out.println();
    }

    public static void task4 () {
        System.out.println("Задача 4");

        int [] integer = new int[3];
        integer[0] = 1;
        integer[1] = 2;
        integer[2] = 3;

        for (int i = 0; i < integer.length; i++) {
            if (integer[i] % 2 != 0) {
                integer[i] = integer[i] + 1;
            }
        }
        System.out.println(Arrays.toString(integer));
    }
}