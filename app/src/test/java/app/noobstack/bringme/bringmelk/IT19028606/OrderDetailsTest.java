package app.noobstack.bringme.bringmelk.IT19028606;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import app.noobstack.bringme.bringmelk.ui.OrderDetails;
import static java.lang.Boolean.TRUE;
import static org.junit.Assert.*;
public class OrderDetailsTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void calculateDcharge(){
        double input= 2;
        double expected=100;
        double delta=.1;
        double output;
        output = OrderDetails.calculateDcharge(input);
        assertEquals(expected, output, delta);

    }
    @Test
    public void checkNumbers(){
        String input="2";
        boolean output=OrderDetails.checkNumbers(input);
        boolean expected=TRUE;
        assertTrue(output);
    }
    @Test
    public void checkifZero(){
        String input="";
        boolean output=OrderDetails.checkifZero(input);
        boolean expected=TRUE;
        assertTrue(output);
    }
    @After
    public void tearDown() throws Exception {
    }


}