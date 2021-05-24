import java.util.Scanner;


public class Calculator extends RomeNumbers implements Operations_able {

    /*
    Небольшая попытка приминения инкапсуляции
    */
    private final static String[] romeNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static String[] getRomeNumbers() {
        return romeNumbers;
    }

    //немного изучал перезапись методов с итерфейса
    @Override
    public int operation(int a, int b, char c) {
        int result;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new RuntimeException("Ввод не соотвестует +,-,*,/; Вы ввели : " + c);
        }
        return result;
    }

    //немного изучал overloading методов, пока без понятии где это пригодится
    public int operation(char c, int a, int b) {
        int result;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                throw new RuntimeException("Ввод не соотвестует +,-,*,/; Вы ввели " + c);
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner scr = new Scanner(System.in);
        String[] inputLine = scr.nextLine().split(" ");

        int a, b;
        char c = inputLine[1].charAt(0);
        boolean b1 = false, b2 = false;
        if (inputLine.length != 3) {
            throw new RuntimeException("Ввод не соответсвует условиям");
        }

        String[] romeNumb = getRomeNumbers();
        for (int x = 0; x < romeNumb.length; x++) {
            if (romeNumb[x].equals(inputLine[0])) {
                b1 = true;
            }
            if (romeNumb[x].equals(inputLine[0])) {
                b2 = true;
            }

        }
        if (!b1 && !b2) {
            a = Integer.parseInt(inputLine[0]);
            b = Integer.parseInt(inputLine[2]);
            if ((a > 10 || a < 1) || (b > 10 || b < 1)) {
                throw new RuntimeException("Число не входит в диапозон от 1 до 10 включительно");
            }
            Calculator calculator = new Calculator();
            System.out.println(calculator.operation(a, b, c));
        }
        if (b1 && b2) {
            a = romeConvertArab(inputLine[0]);
            b = romeConvertArab(inputLine[2]);
            if ((a > 10 || a < 1) || (b > 10 || b < 1)) {
                throw new RuntimeException("Число не входит в диапозон от I до X включительно");
            }
            Calculator calculator = new Calculator();
            System.out.println(intToRoman(calculator.operation(c, a, b)));

        }


    }
}