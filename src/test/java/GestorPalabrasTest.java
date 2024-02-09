
import com.mycompany.gestorpalabras.GestorPalabras;
import static junit.framework.TestCase.*;
import org.junit.Test;

public class GestorPalabrasTest {
    
    @Test
    public void palindromoBasico() {
        GestorPalabras gest = new GestorPalabras();
        assertTrue(gest.esPalindromo("oso") );
        assertTrue(gest.esPalindromo("oso") );
        assertFalse(gest.esPalindromo("cáliz") );
        assertFalse(gest.esPalindromo("sílice") );
    }
    
    @Test
    public void palindromoTilde() {
        GestorPalabras gest = new GestorPalabras();
        assertTrue(gest.esPalindromo("dábale arróz a la zorrá el abad") );
        assertTrue(gest.esPalindromo("allí ves sévilla") );
    }
    
    @Test
    public void palindromoConEspacios() {
        GestorPalabras gest = new GestorPalabras();
        assertTrue(gest.esPalindromo("  Somos    o no somos") );
        assertTrue(gest.esPalindromo(" Anita  lava   la  tina  ") );
    }

    
}
