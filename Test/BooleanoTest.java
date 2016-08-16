import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanoTest {

    @Test
    public void and() throws Exception {
        assertEquals(Booleano.and(true, false), false);
        assertNotEquals(Booleano.and(true, true), false);
    }

    @Test
    public void or() throws Exception {
        assertEquals(Booleano.or(true, false), true);
        assertNotEquals(Booleano.or(true, true), false);
    }
}
