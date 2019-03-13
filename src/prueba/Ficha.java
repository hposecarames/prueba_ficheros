
package prueba;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kinkalla
 */
public class Ficha {
     private HashMap Ham_ListaAtributos = null;
    private ArrayList<String> listaOperaciones = null;

   
    
    public Ficha() {
    }

   
    
    public Ficha(HashMap arl_ListaOperaciones, ArrayList<String> listaOperaciones) {
        this.Ham_ListaAtributos = arl_ListaOperaciones;
        this.listaOperaciones = listaOperaciones;
    }

    public HashMap getHam_ListaAtributos() {
        return Ham_ListaAtributos;
    }

    public void setHam_ListaAtributos(HashMap Ham_ListaAtributos) {
        this.Ham_ListaAtributos = Ham_ListaAtributos;
    }

    public ArrayList<String> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(ArrayList<String> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }
    
}

