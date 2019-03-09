/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ParserSource {

   
    

    private ParserSource() {
       
    }

    public static HashMap run(File archivo) throws FileNotFoundException {
         HashMap Hash_Atributos = new HashMap();
        Atributo auxAtributo = null ;
        Scanner scanner = new Scanner(archivo);
        String auxString = "";
        while (scanner.hasNextLine()) {
           auxString= scanner.nextLine();
           auxAtributo = createAtributeFromText(auxString); // envio al metodo una linea del fichero de ejemplo y recibo un atributo ya formado
           Hash_Atributos.put(auxAtributo.getStr_ID(),auxAtributo); // añado al hashmap el atributo y como key el atributo.id
            
        }
    return Hash_Atributos; }

    public static Atributo createAtributeFromText(String text) {  // esto debe ser privado
        Atributo auxAtributo = new Atributo();
        Scanner scanAtri = new Scanner(text).useDelimiter(","); // divido la cadena de texto en 3 si esta bien formada(faltaria comprobar que esta bien )
        ArrayList<String> al_aux= new ArrayList<>();
        
        
        while(scanAtri.hasNext()){          // agrego a un arraylist de strings temporal los elementos separados
        al_aux.add(scanAtri.next());
               
        }
        if(3 == al_aux.size()){ // compruebo si son 3 elementos como se esperaria de un texto bien fomrado
        auxAtributo.setStr_ID(al_aux.get(0)); // asigno el dato correspondiente al id en esta estructura el primer elemento(0)
        auxAtributo.setStr_Nombre(al_aux.get(1));  // lo mismo con el nombre , elemento (1)
        auxAtributo.setDou_Valor(Double.parseDouble(al_aux.get(2)));  // lo mismo pero con un parse double ya que es lo que necesita el atributo(hay que vigilar la excepcion de bad number format)
        
        }
        else {
        // drop exception atributo mal escrito en el fichero
        
        
        }
        
    return auxAtributo;}

}
