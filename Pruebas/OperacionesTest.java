import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperacionesTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumar() {
        assertEquals(5.0, Operaciones.sumar(2.0, 3.0));
        assertEquals(-7.5, Operaciones.sumar(-2.5, -5.0));
        assertEquals(0.0, Operaciones.sumar(0.0, 0.0));
    }

    @Test
    void restar() {
        assertEquals(2.0, Operaciones.restar(5.0, 3.0));
        assertEquals(0.0, Operaciones.restar(-2.5, -2.5));
        assertEquals(5.0, Operaciones.restar(10.0, 5.0));
    }

    @Test
    void multiplicar() {
        assertEquals(6.0, Operaciones.multiplicar(2.0, 3.0));
        assertEquals(20.0, Operaciones.multiplicar(10.0, 2.0));
        assertEquals(-15.0, Operaciones.multiplicar(5.0, -3.0));
    }

    @Test
    void dividir() {
        assertEquals(2.0, Operaciones.dividir(6.0, 3.0));
        assertEquals(-2.5, Operaciones.dividir(5.0, -2.0));
        assertEquals(-5.0, Operaciones.dividir(10.0, -2.0));
    }
}