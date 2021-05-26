package EditorGrafico;

import java.util.ArrayList;

public class GraficoCompuesto implements Grafico{

    private ArrayList<Grafico> composicion;

    public GraficoCompuesto(){

        this.composicion = new ArrayList<Grafico>();
    }

    public ArrayList<Grafico> getComposicion() {
        return composicion;
    }

    public void setComposicion(ArrayList<Grafico> composicion) {
        this.composicion = composicion;
    }

    public boolean añadeGrafico(Grafico nuevoGrafico)throws MyException{
        composicion.add(nuevoGrafico);
        return true;


    }

    public boolean eliminaGrafico(Grafico viejoGrafico) {
        composicion.remove(viejoGrafico);
        return true;
        /*for (int i=0;i< composicion.size();i++){
            if(composicion.get(i) == viejoGrafico){
                return false;
            }
        }return true;
    }
    */
    }

    @Override
    public boolean mover(int x, int y)throws MyException{
        for(Grafico myGrafico: composicion){
            myGrafico.mover(x,y);
        }
        return true;

    }

    @Override
    public void dibujar() {
        System.out.println("GraficoCompuesto{" +
                "composicion=" + composicion +
                '}');
    }
}
