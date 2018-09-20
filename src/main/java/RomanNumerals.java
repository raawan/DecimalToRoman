
public class RomanNumerals {

    static String decimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();
        for(int i=0;i<decimal;i++) {
            result.append("I");
        }
        return result.toString();
    }
}
