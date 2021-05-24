public class RomeNumbers extends IntToRoman {
    public static int romeConvertArab(String str) {
        if (str.equals("I")) {
            return 1;
        }
        if (str.equals("II")) {
            return 2;
        }
        if (str.equals("III")) {
            return 3;
        }
        if (str.equals("IV")) {
            return 4;
        }
        if (str.equals("V")) {
            return 5;
        }
        if (str.equals("VI")) {
            return 6;
        }
        if (str.equals("VII")) {
            return 7;
        }
        if (str.equals("VIII")) {
            return 8;
        }
        if (str.equals("IX")) {
            return 9;
        }
        if (str.equals("X")) {
            return 10;
        } else return -1;
    }
}
