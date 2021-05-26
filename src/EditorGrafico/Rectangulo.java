package EditorGrafico;

public class Rectangulo extends Punto{
    private int ancho;
    private int alto;

    public Rectangulo(int x, int y, int ancho, int alto) throws MyException {
        super(x, y);
        this.ancho = ancho;
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
