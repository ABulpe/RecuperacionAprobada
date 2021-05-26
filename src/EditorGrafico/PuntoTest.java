package EditorGrafico;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PuntoTest {
    private Punto punto;

    @BeforeEach
    void setUp() throws MyException{
        punto = new Punto(400,250);
    }
    @AfterEach
    void tearDown(){}

    @Test
    void puntoMyException() throws MyException {
        assertThrows(MyException.class,() -> new Punto(800,700));
        assertDoesNotThrow(()->punto);
    }


    @Test
    void getSetX()throws MyException{
        punto.setX(500);
        assertEquals(500,punto.getX());

    }

    @Test
    void getSetY()throws MyException{
        punto.setY(300);
        assertEquals(300,punto.getY());

    }
    @Test
    void testmover() throws MyException {
        punto.mover(300,150);
        assert punto.getX() == 300;
        assert punto.getY() == 400;
        assertThrows(MyException.class, () -> new Punto(900,700));

    }


}