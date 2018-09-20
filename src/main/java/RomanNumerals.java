
public class RomanNumerals {
    private static final int[]    VALUES  = {10, 9,    5,   4 , 1};
    private static final String[] SYMBOLS = { "X" ,"IX", "V", "IV" , "I"};

    static String decimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();
        int remaining = decimal;
        for (int i = 0; i <VALUES.length; i++) {
            remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i], result);
        }
        return result.toString();
    }

    private static int appendRomanNumerals(int decimal, int value, String romanDigits, StringBuilder builder) {
        int temp = decimal;
        while (temp >= value) {
            builder.append(romanDigits);
            temp -= value;
        }
        return temp;
    }
}
