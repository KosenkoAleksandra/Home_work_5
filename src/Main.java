import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Массивы. Часть 1
        //Задача 1.1
        System.out.println("Массивы. Часть 1.");
        System.out.println("Задача 1.1");
        int[] weights = new int[3];
        weights[0] = 1;
        weights[1] = 2;
        weights[2] = 3;
        //Задача 1.2
        System.out.println("Задача 1.2");
        double[] numbers = {1.57, 7.654, 9.986};
        //Задача 1.3
        System.out.println("Задача 1.3");
        int[] marks = {1, 2, 3, 4, 5};

        //Задача 2.
        System.out.println("Задача 2.");
        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1) {
                System.out.println(numbers[i]);
                break;
            }
            System.out.print(numbers[i] + ", ");
        }
            for (int i = 0; i < marks.length; i++) {
                if (i == marks.length - 1) {
                    System.out.println(marks[i]);
                    break;
                }
                System.out.print(marks[i] + ", ");
        }
         //Задача 3.
        System.out.println("Задача 3.");
        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        //Задача 4.
        System.out.println("Задача 4.");
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] % 2 != 0) {
                weights[i] += 1;
            }
        }
        System.out.println(Arrays.toString(weights));












    }
}