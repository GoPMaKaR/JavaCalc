import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NumberFormatException {

        System.out.println("-------Калькулятор арабских цифр-------");
        System.out.println("Калькулятор принимает арабские цифры, от 1 до 10 включительно");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Введи целые числа и арифметическое действие через пробел. Пример: 1 + 4 или 6 * 3");

        try {
            Scanner sc = new Scanner(System.in);
            String expression = sc.nextLine();

            int firstArg = Integer.parseInt(expression.split(" ")[0]);
            if (firstArg == 10) {
                System.out.println("Пожалуйста, укажите цифру 10 вторым числом. Введите число от 1 до 10");
                return;
            }
            if (firstArg < 0 || firstArg > 10) {
                System.out.println("Вы ввели число меньше или больше указаного диапазона чисел.");
                return;
            }
            int secondArg = Integer.parseInt(expression.split(" ")[2]);

            if (secondArg < 0 || secondArg > 10) {
                System.out.println("Вы ввели число меньше или больше указаного диапазона чисел.");
                return;
            }

            String[] arab = {"10", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
            String[] rome = {"X", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            String firstString = expression.split(" ")[0];
            String secondString = expression.split(" ")[2];


            char symbol = expression.charAt(2);
            if (symbol == '+') {
                int sumResult = firstArg + secondArg;
                System.out.println("Ответ: " + sumResult);
            }
            if (symbol == '-') {
                int subsResult = firstArg - secondArg;
                System.out.println("Ответ: " + subsResult);
            }
            if (symbol == '/') {
                int divResult = firstArg / secondArg;
                System.out.println("Ответ: " + divResult);
            }
            if (symbol == '*') {
                int multiResult = firstArg * secondArg;
                System.out.println("Ответ: " + multiResult);
            }
        }catch(NumberFormatException e){
            System.out.println("Вы ввели не правильный формат");
        }
    }
    }
