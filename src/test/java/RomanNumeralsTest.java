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

}
