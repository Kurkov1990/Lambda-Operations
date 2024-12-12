package app;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {

    Scanner sc = new Scanner(System.in);
    StringListProcessor stringListProcessor = new StringListProcessor();
    MathProcessor mathProcessor = new MathProcessor();
    Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
    Function<String, Integer> uppercaseCounter = StringListProcessor::countUppercase;

    public static void main(String[] args) {
        Main main = new Main();
        main.getMathResults();
        main.getRandomNumber();
        main.getTextProcessingResults();
    }

    public void getMathResults() {
        int[] numbers = mathProcessor.getTwoNumbers(sc);
        int a = numbers[0];
        int b = numbers[1];
        System.out.println("Addition result: " + mathProcessor.addition.operate(a, b));

    }

    public void getRandomNumber() {
        System.out.println("Random number from 1 to 100: " + randomNumberSupplier.get());
    }

    public void getTextProcessingResults() {
        System.out.println("Enter text for counting of сapital letters:");
        String text = stringListProcessor.getText(sc);
        StringManipulator toUpperCase = (s) -> s.toUpperCase();
        System.out.println("Count of capital letters in the row: " + uppercaseCounter.apply(toUpperCase.changeRegister(text)));
    }

}
