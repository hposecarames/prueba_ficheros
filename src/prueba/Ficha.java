
package prueba;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kinkalla
 */
public class Ficha {
     private HashMap arl_ListaOperaciones = null;
    private ArrayList<String> listaOperaciones = null;

   
    
    public Ficha() {
    }

   
    
    public Ficha(HashMap arl_ListaOperaciones, ArrayList<String> listaOperaciones) {
        this.arl_ListaOperaciones = arl_ListaOperaciones;
        this.listaOperaciones = listaOperaciones;
    }

    public HashMap getArl_ListaOperaciones() {
        return arl_ListaOperaciones;
    }

    public void setArl_ListaOperaciones(HashMap arl_ListaOperaciones) {
        this.arl_ListaOperaciones = arl_ListaOperaciones;
    }

    public ArrayList<String> getListaOperaciones() {
        return listaOperaciones;
    }

    public void setListaOperaciones(ArrayList<String> listaOperaciones) {
        this.listaOperaciones = listaOperaciones;
    }
    
}

