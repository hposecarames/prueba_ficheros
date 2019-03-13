/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class MetodosReutilizables {
     public static  String unspaceString(String str_OriginalString) {
        
        return cleanString(str_OriginalString,' ');
    }//fin unspaceString
     
     
     public static String cleanString(String str_OriginalString,char patronAEliminar) {
        String str_UnspacedString = "";
        if (str_OriginalString.contains(patronAEliminar+"")) {

            // Aqui compruebo si el caracter en la posicion i es un espacio y si no lo es 
            // añado el caracter a la cadena que devolvere al acabar el bucle.
            for (int i = 0; i < str_OriginalString.length(); i++) {
                if (str_OriginalString.charAt(i) != patronAEliminar) {
                    str_UnspacedString += str_OriginalString.charAt(i);

                }

            }
        } else {
            str_UnspacedString = str_OriginalString;
        }

        return str_UnspacedString;
    }//fin unspaceString
}
