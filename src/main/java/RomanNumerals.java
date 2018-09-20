
public class RomanNumerals {

    static String decimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();
        int remaining = decimal;
        remaining = appendRomanNumerals(remaining, 9, "IX", result);
        remaining = appendRomanNumerals(remaining, 5, "V", result);
        remaining = appendRomanNumerals(remaining, 4, "IV", result);
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
