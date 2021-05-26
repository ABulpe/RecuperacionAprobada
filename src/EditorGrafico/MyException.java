package EditorGrafico;

public class MyException extends Exception{

    private int codigoError;

    public MyException(int codigoError){
        super();
        this.codigoError=codigoError;
    }

    @Override
    public String getMessage(){

        String mensaje="";

        switch(codigoError){
            case 111:
                mensaje="Error, se ha salido de los limites de la pantalla(800,600)";
                break;

        }

        return mensaje;

    }
}
