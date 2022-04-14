/**Calculator by Sh.Akht*/
import java.util.Scanner;

public class Calc_ver_1 {
    public static void main(String[] args) {
        int a1 = 0;
        int b1 = 0;
        int er = 0, ar = 0;
        int result = 0, v = 0;
        System.out.println("Введите операцию, которую необходимо выполнить:");

        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String op = scan.next();
        String b = scan.next();
        String[] rome = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV",
                "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII",
                "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII",
                "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI",
                "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV",
                "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI",
                "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI",
                "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII",
                "XCVIII", "XCIX", "C"};
        int[] arab = new int[10];
        for (int i = 0; i < arab.length; i++) {
            arab[i] = i + 1;}

        for (int x = 0; x < rome.length; x++) {
            if (a.equals(rome[x])) {
                a1 = x + 1;
                er = er + 1;
            }
        }
        for (int j = 0; j < rome.length; j++) {
            if (b.equals(rome[j])) {
                b1 = j + 1;
                er = er + 1;
            }
        }
        for (int j = 0; j < arab.length; j++) {
            try {
                a1 = Integer.parseInt(a);}
            catch (Throwable t) {
                ar = 100;
            }
        }
        for (int k = 0; k < arab.length; k++) {
            try{
                b1 = Integer.parseInt(b);}
            catch (Throwable t) {
                ar = 100;}
        }
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(op);

        if ((a1 < 0 || a1 > 10) || (b1 < 0 || b1 > 10)) {
            throw new IllegalArgumentException("Введены неверные числа");
        }

        switch (op) {
            case "+":
                result = a1 + b1;
                break;
            case "-":
                result = a1 - b1;
                if ((result <= 0)&(er==2)){
                    throw new IllegalArgumentException("В римской системе нет отрицательных чисел");
                }
                break;
            case "*":
                result = a1 * b1;
                break;
            case "/":
                try {
                    result = a1 / b1;
                } catch (Throwable t) {
                    throw new IllegalArgumentException("На ноль делить нельзя!");
                }
                break;
            default:
                throw new IllegalArgumentException("Не верный знак операции");
        }

        if ((er == 2)&(ar == 100)){
            for (int x = 0; x < rome.length; x++) {
                if (result == (x + 1)) {
                    System.out.println("Результат операции: " + rome[x]);
                }
            }
        }
        else if(ar != 100) System.out.println("Результат операции1: "+result);

        else throw new IllegalArgumentException("Введены неверные данные");
    }}