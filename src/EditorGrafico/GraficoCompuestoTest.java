package EditorGrafico;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraficoCompuestoTest {
    private GraficoCompuesto MyComposicion;
    Punto myPunto;
    Rectangulo myRectangulo;
    Circulo myCirculo;

    @BeforeEach
    void setUp() throws MyException{
        myCirculo = new Circulo(300, 200, 50);
        myPunto = new Punto(200, 150);
        myRectangulo = new Rectangulo(500, 240, 100, 200);
        MyComposicion = new GraficoCompuesto();
        MyComposicion.añadeGrafico(myCirculo);
        MyComposicion.añadeGrafico(myPunto);
        MyComposicion.añadeGrafico(myRectangulo);

    }
    @AfterEach
    void tearDown(){}

    @Test
    void puntoMyException() throws MyException {

    }
    @Test
    void testmover() throws MyException {
        MyComposicion.mover(300,150);


    }


}