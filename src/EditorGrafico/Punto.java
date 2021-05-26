package EditorGrafico;

public class Punto implements Grafico{
    protected int x;
    protected int y;

    public Punto(int x, int y) throws MyException {
       setX(x);
       setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x)throws MyException {
        if( x > 800){throw new MyException(111);}
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y)throws MyException {
        if( y > 600){throw new MyException(111);}
        this.y = y;
    }

    @Override
    public boolean mover(int x, int y)throws MyException{
        try{setY(y);
        setX(x);
        return true;}
        catch(MyException e){
            return false;
        }
    }

    @Override
    public void dibujar() {
        System.out.println("Punto{" +
                "x=" + x +
                ", y=" + y +
                '}');
    }
}
