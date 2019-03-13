
package prueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
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
    public static void main(String[] args) throws FileNotFoundException   {
       //------------------------------------------- Metelo en una clase unica para manejar todo esto en el main no deberias hacer nada de esto.
//        FileReader filereader = new FileReader("C:\\Users\\pav_g\\Documents\\netbeans java\\prueba_ficheros\\src\\prueba\\Prueba.txt");
        
//       Scanner scanner = new Scanner (filereader); // para probarlo tendras que cambiar la direccion
//       Map<String, String[]> map= new HashMap<String,String[]>();  // por que haces un  map con string y un array de strings? tenias que devolver un hashmap de Atributos
//       while(scanner.hasNextLine()){  //  con esto lees todas las lineas
//           String[] colums = scanner.nextLine().split(",");
//           String[] valores = {colums[1], colums[2]};
//           map.put(colums[0], valores); 
//       
//       }
//       for(Map.Entry<String, String[]> datos: map.entrySet()){  // tal y como lo veo este uso del hashmap esta mal usado. seria mas practico un array list en esta parte del programa
//           Atributo atributo = new Atributo(datos.getKey(), datos.getValue());  
//           System.out.println(atributo.toString());
//       } // donde metes los atributos que creas?
       
       
       
       
      //-------------------------- 
       
       
  //  File archivo = new File("/home/pablo/NetBeansProjects/pruebafich/prueba_ficheros/src/prueba/Prueba.txt");
    
//  HashMap x = ParserSource.run(archivo);
//  Iterator s = x.keySet().iterator();
// while( s.hasNext()){
//     System.out.println(x.get(s.next()));
//  
//  
//  
//  }
//    // prueba del traductor de atributos
//    Atributo dsfa = ParserSource.createAtributeFromText("FUE,Fuerza,5");
//        System.out.println(dsfa.toString());
//    
//    } 
    
//-------------------------- Prueba limpiador STrings

   //     System.out.print(MetodosReutilizables.cleanString("safsadklñfjas\nadjfsñdkjfasld\n", '\n'));

//-------------------------


  HashMap x = ParserSource.run("FUE,Fuerza,5;\n" +
"CON,Constitucion,3;\n" +
"DES,Destreza,6;\n" +
"AGI,Agilidad,12;\n" +
"DES,Destreza,10;\n" +
"PER,Percepcion,15;\n" +
"");
  Iterator s = x.keySet().iterator();
 while( s.hasNext()){
     System.out.println(x.get(s.next()));
  
  
  
  }
    // prueba del traductor de atributos
//    Atributo dsfa = ParserSource.createAtributeFromText("FUE,Fuerza,5");
//        System.out.println(dsfa.toString());
//    
//        System.out.println();
//    
    } 
    
    }

    

    

