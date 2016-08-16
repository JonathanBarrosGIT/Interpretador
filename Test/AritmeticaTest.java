import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JonathanBarros on 8/15/16.
 *
 */
public class AritmeticaTest {

    @Test
    public void somar() throws Exception {
        assertEquals(Aritmetica.somar(1,2), 3);
        assertNotEquals(Aritmetica.somar(-1, 2), 2);
    }

    @Test
    public void multiplicar() throws Exception {
        assertEquals(Aritmetica.multiplicar(3, 3), 9);
        assertNotEquals(Aritmetica.multiplicar(2, -2), 5);
    }

    @Test
    public void dividir() throws Exception {
        assertEquals(Aritmetica.dividir(1, 0), 0);
        assertEquals(Aritmetica.dividir(140, 2), 70);
        assertNotEquals(Aritmetica.dividir(0, 1), 1);
        assertEquals(Aritmetica.dividir(-10, 2), -5);
    }

    @Test
    public void subtrair() throws Exception {
        assertEquals(Aritmetica.subtrair(1, 1), 0);
    }

}
