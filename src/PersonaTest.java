import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PersonaTest {
    private Persona persona;

    @Before
    public void setUp() {
        persona = new Persona();
    }

    @Test
    public void testSetDniValido() {
        assertTrue(persona.setDni("12345678"));
    }

    @Test
    public void testSetDniInvalido() {
        assertFalse(persona.setDni("1234"));
        assertFalse(persona.setDni("abcdefgh"));
        assertFalse(persona.setDni("123456789"));
    }

    @Test
    public void testSetContrasenaValida() {
        assertTrue(persona.setContrasena("unaContrasenaSegura"));
    }

    @Test
    public void testSetContrasenaInvalida() {
        assertFalse(persona.setContrasena("short"));
        assertFalse(persona.setContrasena("12345678"));
    }
}
