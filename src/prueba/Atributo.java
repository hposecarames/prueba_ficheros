
package prueba;

/**
 *
 * @author Kinkalla
 */
public class Atributo {

    private String str_Nombre = null;
    private String str_ID = null;
    private Double dou_Valor = null;
    
    public Atributo() {
    }
    public Atributo(String clave, String[]valores){
        
        this.str_ID=clave;
        this.str_Nombre=valores[0];
        this.dou_Valor=Double.parseDouble(valores[1]);
    }

    @Override
    public String toString() {
        return "Atributo{" + "str_Nombre=" + str_Nombre + ", str_ID=" + str_ID + ", dou_Valor=" + dou_Valor + '}';
    }
            
            
    public String getStr_Nombre() {
        return str_Nombre;
    }

    public void setStr_Nombre(String str_Nombre) {
        this.str_Nombre = str_Nombre;
    }

    public String getStr_ID() {
        return str_ID;
    }

    public void setStr_ID(String str_ID) {
        this.str_ID = str_ID;
    }

    public Double getDou_Valor() {
        return dou_Valor;
    }

    public void setDou_Valor(Double dou_Valor) {
        this.dou_Valor = dou_Valor;
    }
    
    
}
