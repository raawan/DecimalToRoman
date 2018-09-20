
public class RomanNumerals {

    static String decimalToRoman(int decimal) {
        StringBuilder result = new StringBuilder();
        int remaining = decimal;
        if (remaining == 9) {
            result.append("IX");
            remaining -= 9;
        }
        if(remaining >= 5) {
            result.append("V");
            remaining-=5;
        }
        if(remaining==4) {
            result.append("IV");
            remaining-=4;
        }
        for(int i=0;i<remaining;i++) {
            result.append("I");
        }
        return result.toString();
    }
}
