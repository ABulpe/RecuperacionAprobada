package EditorGrafico;

public class Circulo extends Punto{
    private int radio;

    public Circulo(int x, int y, int radio) throws MyException {
        super(x, y);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
