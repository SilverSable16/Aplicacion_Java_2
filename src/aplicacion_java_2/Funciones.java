/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_java_2;
import static aplicacion_java_2.Buscar.Txt_bus;
import static aplicacion_java_2.Rempla.Text_Rempla;
import static aplicacion_java_2.Rempla.Text_Rempla_1;
import java.awt.List;
import java.text.Normalizer;
import java.util.ArrayList;

/**
 *
 * @author JPonce
 */
public class Funciones {
     public static void Repa(String text, String letra){
        
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(letra)){
               times++;
           }
       }
      // System.out.print(times);
       Programacion_II.repetecion_a.setText(Integer.toString(times));
       
   }
      public static void Repe(String text, String letra){
        
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
   //    System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Programacion_II.repetecion_e.setText(Integer.toString(times));
       
   }
      
       public static void Repi(String text, String letra){
        
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Programacion_II.repetecion_i.setText(Integer.toString(times));
       
   }
       
        public static void Repo(String text, String letra){
        
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
     //   System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
     //  System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Programacion_II.repetecion_o.setText(Integer.toString(times));
       
   }
        
         public static void Repu(String text, String letra){
        
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
      //  System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
      // System.out.println("Resultado: " + s);
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(letra)){
               times++;
           }
       }
     //  System.out.print(times);
       Programacion_II.repetecion_u.setText(Integer.toString(times));
       
   }
         
         public static void PAR(String text){
             String[] valorarray = text.split(" ");
             int sumPar=0;
             int sumImp=0;
             
             
             for (int i = 0; i < valorarray.length; i++){
            String palabra = valorarray[i];
            // System.out.println(palabra);
            int cont = palabra.length();
            //System.out.println(cont);
            
            if (cont % 2 == 0 ){
                sumPar = sumPar + 1;
                
            }else {
                sumImp = sumImp + 1;
            }
            
        }
            
             Programacion_II.cantidad_par.setText(Integer.toString(sumPar));
             Programacion_II.cantidad_impar.setText(Integer.toString(sumImp));
         }
         
         
          public static void Buscar(){
              
              String text = Programacion_II.area_text.getText();
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
       
       String find = Txt_bus.getText();
      
       
       
       int times =0;
       for (int i = 0; i < a.length(); i++){
           if (a.substring(i).startsWith(find)){
               times++;
               
           }
       }
    
       


          }
          
          public static void replace(){
       
   
   String text = Programacion_II.area_text.getText();
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
       
       String find = Text_Rempla.getText();
       String rep = Text_Rempla_1.getText();
       
    
       
       for (int i = 0; i <find.length(); i++){
          // s = s.replace(abecedario[i], traductor[i]);
           a = a.replace(find, rep);
       }
       Programacion_II.area_text.setText(a);
    
   }
    
}
