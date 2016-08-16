import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JonathanBarros on 8/15/16.
 *
 */
public class BitWiseTest {
    @Test
    public void stringComp() throws Exception {
        assertEquals(BitWise.stringComp("Teste", "Teste"), true);
        assertNotEquals(BitWise.stringComp("Teste", ""), true);
    }

    @Test
    public void numberEqual() throws Exception {
        assertEquals(BitWise.numberEqual(1, 1), true);
        assertNotEquals(BitWise.numberEqual(0, 1), true);
    }

    @Test
    public void numberR1Great() throws Exception {
        assertEquals(BitWise.numberR1Great(1, 0), true);
        assertEquals(BitWise.numberR1Great(0, 1), false);
        assertNotEquals(BitWise.numberR1Great(1, 0), false);
    }

    @Test
    public void numberR1Lower() throws Exception {
        assertEquals(BitWise.numberR1Lower(0, 1), true);
        assertEquals(BitWise.numberR1Lower(1, 0), false);
        assertEquals(BitWise.numberR1Lower(-1, 0), true);
        assertNotEquals(BitWise.numberR1Lower(1, 0), true);
    }

}
