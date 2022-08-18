/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_java_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author JPonce
 */
public class Archivo {
      private JFileChooser accion = null;
    private java.io.File archivo = null;
    private Programacion_II Programacion_II;
    public static String ruta = "    public static String ruta = \"\";\n" +
"";
    
     static Path fileName = Path.of(
            "D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
    
    public static void insert(String s)
        throws IOException 
    {   
        String d = "\r\n";
        Files.writeString(fileName, d,StandardOpenOption.APPEND);
        //Files.writeString(fileName, s);
        Files.writeString(fileName, s,StandardOpenOption.APPEND);
        
    }
    
     public void LeerFichero(Programacion_II frm_start) {
        this.Programacion_II = frm_start;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Abrir archivo");
        if (accion.showOpenDialog(frm_start) == JFileChooser.APPROVE_OPTION) {
            archivo = accion.getSelectedFile();
            frm_start.Nombre.setText(archivo.getName());
            ruta = accion.getSelectedFile().toString();
            try {
                /*Si existe el fichero*/
                if (archivo.exists()) {
                    /*Abre un flujo de lectura a el fichero*/
                    BufferedReader leeArchivo = new BufferedReader(new FileReader(archivo));
                    String Slinea, datos = "";
                    /*Lee el fichero linea a linea hasta llegar a la ultima*/
                    while ((Slinea = leeArchivo.readLine()) != null) {
                        /*Imprime la linea leida*/
                        datos = datos + Slinea + "\n";
                    }
                    frm_start.area_text.setText("");
                    frm_start.area_text.setText(datos);
                    frm_start.area_text.setEditable(true);
                    frm_start.area_text.requestFocus();
                    /*Cierra el flujo*/
                    leeArchivo.close();
                    this.Programacion_II.abrioArchivo = true;
                    this.Programacion_II.creoNuevo = false;
                } else {
                    System.out.println("Fichero No Existe");
                }
            } catch (Exception ex) {
                /*Captura un posible error y le imprime en pantalla*/
                System.out.println(ex.getMessage());
            }
        }
    }
    
  public void CrearFicheroNuevo(Programacion_II Programacion_II, String SCadena, String nombre) {
        this.Programacion_II = Programacion_II;

        accion = new JFileChooser();
        accion.setFileSelectionMode(0);
        FileNameExtensionFilter filtroImagen = new FileNameExtensionFilter("TXT", "txt");
        accion.setFileFilter(filtroImagen);
        accion.setDialogTitle("Guardar archivo " + nombre);
        accion.setSelectedFile(new java.io.File(nombre));
        if (accion.showSaveDialog(Programacion_II) == JFileChooser.APPROVE_OPTION) {
            ruta = accion.getSelectedFile().toString();
            archivo = new java.io.File(ruta);
            Programacion_II.Nombre.setText(archivo.getName());
            try {
                //Si Existe el fichero lo borra
                if (archivo.exists()) {
                    archivo.delete();
                }
                BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
                FileWriter escribirArchivo = new FileWriter(archivo, true);
                BufferedWriter buffer = new BufferedWriter(escribirArchivo);
                buffer.write(SCadena);
                buffer.newLine();
                buffer.close();
                wr.close();
                escribirArchivo.close();

                this.Programacion_II.abrioArchivo = true;
                this.Programacion_II.creoNuevo = false;
            } catch (Exception ex) {
            }
        }
    }
     
      public void GuardarFichero(String SCadena, String nombre) {

        System.out.println(ruta);
        archivo = new java.io.File(ruta);
        try {
            //Si Existe el fichero lo borra
            if (archivo.exists()) {
                archivo.delete();
            }
            BufferedWriter wr = new BufferedWriter(new FileWriter(archivo));
            FileWriter escribirArchivo = new FileWriter(archivo, true);
            BufferedWriter buffer = new BufferedWriter(escribirArchivo);
            buffer.write(SCadena);
            buffer.newLine();
            buffer.close();
            wr.close();
            escribirArchivo.close();
        } catch (Exception ex) {
            //Captura un posible error le imprime en pantalla 
            System.out.println(ex.getMessage());
        }
    }


}
