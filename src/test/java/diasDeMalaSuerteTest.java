

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class diasDeMalaSuerteTest {
    @Test
    public void Input2015Exp3() {
        assertEquals(3, diasDeMalaSuerte.diasDeMalaSuerte(2015));
    }
    @Test
    public void Input1986Exp1() {
        assertEquals(1, diasDeMalaSuerte.diasDeMalaSuerte(1986));
    }

}
