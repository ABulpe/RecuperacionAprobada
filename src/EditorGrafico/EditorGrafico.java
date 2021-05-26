package EditorGrafico;

import java.util.ArrayList;

public class EditorGrafico {
    public static void main(String[] args) throws MyException {
        GraficoCompuesto conjunto;
        Punto myPunto;
        Rectangulo myRectangulo;
        Circulo myCirculo;
        myCirculo = new Circulo(300, 200, 50);
        myPunto = new Punto(200, 150);
        myRectangulo = new Rectangulo(500, 240, 100, 200);
        conjunto = new GraficoCompuesto();

        conjunto.añadeGrafico(myCirculo);
        conjunto.añadeGrafico(myPunto);
        conjunto.añadeGrafico(myRectangulo);

        conjunto.dibujar();
        conjunto.mover(400, 550);
        conjunto.dibujar();
        /*El main no me da tiempo hacerlo en condiciones -.- */


    }
}