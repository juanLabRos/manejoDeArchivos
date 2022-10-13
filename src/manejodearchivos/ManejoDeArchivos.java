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
import java.io.FileWriter;
import java.io.IOException;
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
        
        //String para nombrar el archivo
        String nombreArchivo2 = "escribirArchivo.txt";
        //creación archivo con el nombre
        ManejoDeArchivos.escribirArchivo(nombreArchivo2, "Se puede escribir");
        
        String nombreArch = "prueba2.txt";
        ManejoDeArchivos.agregarArchivo(nombreArch, "Aqui van los contenidos, no se sobreescribe el archivo");
        
    }
    public static void escribirArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try { //Se que el fichero existe
            salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) { //El fichero no existe --> Excepcion
            Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } finally { //Este bloque siempre se ejecuta
            salida.close();
        }
}
    
    public static void agregarArchivo(String nombre, String contenido){
        PrintWriter salida = null;
        File archivo = new File(nombre);
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            Logger.getLogger(ManejoDeArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            salida.close();
        }
    }
}
