package app;

import java.util.Scanner;

public class StringListProcessor{

    public static int countUppercase(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return (int) str.chars()
                .filter(Character::isUpperCase)
                .count();
    }

    public String getText(Scanner sc) {
        return sc.nextLine();
    }

}
