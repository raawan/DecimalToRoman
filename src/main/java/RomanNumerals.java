/**
 * Created by Minal.Fulzele on 20/09/2018.
 */
public class RomanNumerals {

    static String decimalToRoman(int decimal) {
        if(decimal==2) {
            return "II";
        } else if (decimal == 3) {
            return "III";
        }
        return "I";
    }
}
