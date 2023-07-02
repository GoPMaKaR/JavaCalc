import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------Калькулятор арабских цифр-------");
        System.out.println("Калькулятор принимает арабские цифры, от 1 до 10 включительно");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Введи целые числа и арифметическое действие через пробел. Пример: 1 + 4 или 6 * 3");
        Scanner sc = new Scanner(System.in);
        calc(sc.nextLine());
    }

    public static String calc(String input) {
        try {

            String expression = input;
            int length = expression.length();

            if (length <= 6) {

                int firstArg = Integer.parseInt(expression.split(" ")[0]);
                if (firstArg == 10) {
                    System.out.println("Пожалуйста, укажите цифру 10 вторым числом. Введите число от 1 до 10");

                }
                if (firstArg < 0 || firstArg > 10) {
                    System.out.println("Вы ввели число меньше или больше указаного диапазона чисел. Введите числа от 1 до 10");

                }
                int secondArg = Integer.parseInt(expression.split(" ")[2]);

                if (secondArg < 0 || secondArg > 10) {
                    System.out.println("Вы ввели число меньше или больше указаного диапазона чисел.");

                }

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
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не правильный формат");
        } catch (ArrayIndexOutOfBoundsException exe) {
            System.out.println("Строка не является математической операцией");
        }
        return input;
    }
}
