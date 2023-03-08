import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrador
 */
public class MathUtilTest {
    
    public MathUtilTest() {
    }

    @Test
    public void testMdc() {
        int a = 6;
        int b = 3;
        int esperado = 2;
        int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado,obtido);
    }}