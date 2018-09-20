
public class RomanNumerals {
    private static final int[]    VALUES  = { 9,    5,   4 };
    private static final String[] SYMBOLS = { "IX", "V", "IV" };

    static String decimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();
        int remaining = decimal;
        for (int i = 0; i < VALUES.length; i++) {
            remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i], result);
        }
        for(int i=0;i<remaining;i++) {
            result.append("I");
        }
        return result.toString();
    }

    private static int appendRomanNumerals(int decimal, int value, String romanDigits, StringBuilder builder) {
        int result = decimal;
        if (result >= value) {
            builder.append(romanDigits);
            result -= value;
        }
        return result;
    }
}
