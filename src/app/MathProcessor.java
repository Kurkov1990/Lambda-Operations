package app;

import java.util.Scanner;

public class MathProcessor {

    MathOperation addition = Integer::sum;

    public int[] getTwoNumbers(Scanner sc) {
        int[] numbers = new int[2];
        while (true) {
            try {
                System.out.println("Enter 2 numbers for calculation: ");
                numbers[0] = sc.nextInt();
                numbers[1] = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid values.");
                sc.nextLine();
            }
        }
        return numbers;
    }

}
