
package prueba;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Kinkalla
 */
public class Ficha {
     private HashMap Ham_ListaAtributos = null;
    private ArrayList<String> AL_listaOperaciones = null;

   
    
    public Ficha() {
    }

   
    
    public Ficha(HashMap arl_ListaOperaciones, ArrayList<String> listaOperaciones) {
        this.Ham_ListaAtributos = arl_ListaOperaciones;
        this.AL_listaOperaciones = listaOperaciones;
    }

    public HashMap getHam_ListaAtributos() {
        return Ham_ListaAtributos;
    }

    public void setHam_ListaAtributos(HashMap Ham_ListaAtributos) {
        this.Ham_ListaAtributos = Ham_ListaAtributos;
    }

    public ArrayList<String> getAL_listaOperaciones() {
        return AL_listaOperaciones;
    }

    public void setAL_listaOperaciones(ArrayList<String> AL_listaOperaciones) {
        this.AL_listaOperaciones = AL_listaOperaciones;
    }
    
}

