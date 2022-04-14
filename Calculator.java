import java.util.Scanner;


public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    static int number1 = -1, number2 = -1, result = 0;
    static boolean rom1 = false, rom2 = false;
    static char opera = ' ';

    static String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
            "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
            "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
            "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
            "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
            "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI",
            "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI",
            "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
            "XCVIII", "XCIX", "C"};

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в калькулятор!");
        System.out.println("Введите операцию, которую необходимо выполнить: ");
        System.out.println("///Данные необходимо вводить в формате 5 + 5 или V - V через пробел. " +
                "Для обозначения римских цифр необходимо использовать латинские буквы (I, V, X)///");

        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (int x = 0; x < 10; x++) {
            if (elements[0].equals(rome[x])) {
                number1 = x + 1;
                rom1 = true;
                break;
            } else if ((number1 == -1) & (x == 9)) try {
                number1 = Integer.parseInt(elements[0]);
            } catch (Throwable t) {
                throw new IllegalArgumentException("Введены неверные данные1!");
            }
        }
        for (int y = 0; y < 10; y++) {
            if (elements[2].equals(rome[y])) {
                number2 = y + 1;
                rom2 = true;
                break;
            } else if ((number2 == -1) & (y == 9)) try {
                number2 = Integer.parseInt(elements[2]);
            } catch (Throwable t) {
                throw new IllegalArgumentException("Введены неверные данные2!");
            }
        }

        opera = elements[1].charAt(0);

        if ((opera != '+') && (opera != '-') && (opera != '*') && (opera != '/')) {
            throw new IllegalArgumentException("Неверная операция");
        }

        if ((number1 < 1 || number1 > 10) || (number2 < 1 || number2 > 10)) {
            throw new IllegalArgumentException("Выход из диапозона допустимых значений [от 1 до 10]");
        }
        if (((rom1) & (!rom2)) || ((!rom1) & (rom2))) {
            throw new IllegalArgumentException("Введённые данные недопустимы! Могут быть использованы только римские или арабские цифры");
        }

        if ((rom1) & (rom2)) {
            result = calculate(number1, number2, opera);
            String resultRoman = RomeToArab(result);
            System.out.println("Ответ: " + resultRoman);
        } else {
            result = calculate(number1, number2, opera);
            System.out.println("Ответ: " + result);
        }
    }

    static int calculate(int a, int b, char op) {
        int answer = 0;
        switch (op) {
            case '+':
                answer = a + b;
                break;
            case '-':
                answer = a - b;
                break;
            case '*':
                answer = a * b;
                break;
            case '/':
                answer = a / b;
                break;
        }
        return answer;
    }

    static String RomeToArab(int number) {
        String string;
        try {
            string = rome[number - 1];
        } catch (Throwable t) {
            throw new IllegalArgumentException("Ошибка! В римской системе нет отрицательных чисел");
        }
        return string;
    }
}
