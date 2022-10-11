/*
    Nuestra clase manejo de archivos va a contener los siguientes métodos
    -Crear un archivo
    -Guardar info en un archivo
    -Eliminar info de un archivo
    -Eliminar un archivo
 */
package manejodearchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Juan Labandeira
 */
public class ManejoDeArchivos {

    public static void crearArchivo(String nombre){
      File archivo = new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            
        } catch (FileNotFoundException ex) {
            
        
        }
    }
    
    public static void main(String[] args) {
        
        String nombreArchivo = "prueba.txt";
        ManejoDeArchivos.crearArchivo(nombreArchivo);
    }
    
}
