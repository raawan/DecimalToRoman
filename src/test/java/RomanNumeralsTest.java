import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Minal.Fulzele on 20/09/2018.
 */
public class RomanNumeralsTest {

    @Test
    public void one(){
        //expected:actual
        Assert.assertEquals("I",RomanNumerals.decimalToRoman(1));
    }

    @Test
    public void two(){
        Assert.assertEquals("II",RomanNumerals.decimalToRoman(2));
    }

    @Test
    public void three(){
        Assert.assertEquals("III",RomanNumerals.decimalToRoman(3));
    }

    @Test
    public void four() {
        Assert.assertEquals("IV",RomanNumerals.decimalToRoman(4));
    }

    @Test
    public void five() {
        Assert.assertEquals("V",RomanNumerals.decimalToRoman(5));
    }

    @Test
    public void six() {
        Assert.assertEquals("VI",RomanNumerals.decimalToRoman(6));
    }

}
