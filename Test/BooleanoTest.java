import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JonathanBarros on 8/15/16.
 *
 */
public class BooleanoTest {
    @Test
    public void and() throws Exception {
        assertEquals(Booleano.and(true, true), true);
        assertEquals(Booleano.and(true, false), false);
        assertEquals(Booleano.and(false, false), false);
    }

    @Test
    public void or() throws Exception {
        assertEquals(Booleano.or(true, true), true);
        assertEquals(Booleano.or(true, false), true);
        assertEquals(Booleano.or(false, false), false);
    }

}
