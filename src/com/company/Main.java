package com.company;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        do {
            try {
            System.out.println("сан бериниз: ");
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            char[] under_char = new char[10];
            char operation = 10;
            for (int i = 0; i < userInput.length(); i++) {
                under_char[i] = userInput.charAt(i);
                if (under_char[i] == '+') {
                    operation = '+';
                }
                if (under_char[i] == '-') {
                    operation = '-';
                }
                if (under_char[i] == '*') {
                    operation = '*';
                }
                if (under_char[i] == '/') {
                    operation = '/';
                }
            }
            String under_charString = String.valueOf(under_char);
            String[] blacks = ( under_charString).split("[+ -/*]");
            String stable00 = blacks[0];
            String stable01 = blacks[1];
            String string03 = stable01.trim();
            int number1 = romanToNumber(stable00);
            int number2 = romanToNumber(string03);
            int result;
            if (number1 < 0 && number2 < 0) {
            } else {
                result = calculated(number1, number2, operation);
                System.out.println("жообу: ");
                 String resultRoman = convertNumToRoman(result);
                System.out.println(stable00 + " " + operation + " " + string03 + " = " + resultRoman);
            }
            number1 = Integer.parseInt(stable00);
            number2 = Integer.parseInt(string03);
            result = calculated(number1, number2, operation);
            System.out.println("Жообу: ");
            System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
        }
            catch (Throwable a ) {

            }
        }
    while (true);
        }

    private static String convertNumToRoman(int numArabian) {
    try {
        String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII",
                "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII",
                "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII",
                "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
        };
        return roman[numArabian];
    } catch (Throwable b) {
       
    }
        return null;
    }
    private static int romanToNumber( String roman) {
        try {
            switch (roman) {
                case "I":
                    return 1;
                case "II":
                    return 2;
                case "III":
                    return 3;
                case "IV":
                    return 4;
                case "V":
                    return 5;
                case "VI":
                    return 6;
                case "VII":
                    return 7;
                case "VIII":
                    return 8;
                case "IX":
                    return 9;
                case "X":
                    return 10;
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("туура эмес маалымать: ");
        }
        return -1;
    }

    public static int calculated(int num1, int num2, char op) {
        int  result = 0;
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                try {
                    result = num1 / num2;
                } catch (ArithmeticException | InputMismatchException e) {
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Туура эмес аракет: ");
        }
        return result;
    }

}


