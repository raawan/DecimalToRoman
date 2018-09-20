
public class RomanNumerals {

    static String decimalToRoman(int decimal) {
        if(decimal==5) {
            return "V";
        }
        if(decimal==4) {
            return "IV";
        }
        StringBuilder result = new StringBuilder();
        for(int i=0;i<decimal;i++) {
            result.append("I");
        }
        return result.toString();
    }
}
