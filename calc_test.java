import java.util.Scanner;


public class calc_test {
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

        String[] elements = input.split("");


        for (int x = 0; x < elements.length; x++){
            System.out.println(elements[x]);
        }
    }
}