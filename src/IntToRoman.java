
abstract public class IntToRoman {

    public static String intToRoman(int num) {
        String C[] = {"", "C"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }
}


