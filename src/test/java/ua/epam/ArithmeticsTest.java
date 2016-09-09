package ua.epam;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kristina_Tverdokhlib on 9/9/2016.
 */
public class ArithmeticsTest {
    @Test
    public void add () throws Exception {
        Arithmetics a = new Arithmetics();
       double res = a.add(3,7);
        if(res != 10) Assert.fail();

    }
@Test
    public void deduct () throws Exception {
        Arithmetics a = new Arithmetics();
    double res = a.deduct(7,3);
    if(res !=4) Assert.fail();
}
@Test
    public void mult () throws Exception {
        Arithmetics a = new Arithmetics();
    double res = a.mult(2,2);
    if(res != 4) Assert.fail();
}
}
