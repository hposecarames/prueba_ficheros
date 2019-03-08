
package prueba;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author Kinkalla
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException  {
       
       Scanner scanner = new Scanner (new FileReader("C:\\Users\\Kinkalla\\Documents\\NetBeansProjects\\Programacion\\Prueba\\src\\prueba\\prueba.txt"));
       Map<String, String[]>map= new HashMap<String,String[]>();
       while(scanner.hasNextLine()){
           String[] colums = scanner.nextLine().split(",");
           String[] valores = {colums[1], colums[2]};
           map.put(colums[0], valores);
       
       }
       for(Map.Entry<String, String[]> datos: map.entrySet()){
           Atributo atributo = new Atributo(datos.getKey(), datos.getValue());
           System.out.println(atributo.toString());
       } 
    }
    
}
