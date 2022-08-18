/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacion_java_2;
import java.text.Normalizer;
/**
 *
 * @author JPonce
 */
public class murci {
     public static void Encode(String text){
       
   
   
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
       
       String av="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abecedario = av.split(",");
       String[] traductor= tr.split(",");
       
       for(int i=0; i < abecedario.length; i++){
        System.out.println(abecedario[i]);
        }
       
       for(int i=0; i < traductor.length; i++){
        System.out.println(traductor[i]);
        }
       
       for (int i = 0; i <26; i++){
           a = a.replace(abecedario[i], traductor[i]);
       }
       Programacion_II.Clave_murci.setText(a);
    
   }
   
   
   public static void Decode(String text){
       
        String cadenaNormalize = Normalizer.normalize(text, Normalizer.Form.NFD);   
        String text2 = cadenaNormalize.replaceAll("[^\\p{ASCII}]", "");
        //System.out.println("Resultado: " + valor2);
       //String[] chararray = valor2.split("");
       //String[] valorarray = valor2.split(" ");
       String a= text2.toLowerCase();
       
       String av="a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z";
       String tr="7,B,3,D,5,F,8,H,4,J,K,6,0,N,9,P,Q,2,S,T,1,V,W,X,Y,Z";
       String[] abecedario = av.split(",");
       String[] traductor= tr.split(",");
       
       for(int i=0; i < abecedario.length; i++){
        System.out.println(abecedario[i]);
        }
       
       for(int i=0; i < traductor.length; i++){
        System.out.println(traductor[i]);
        }
       
       for (int i = 0; i <26; i++){
           a = a.replace(traductor[i], abecedario[i]);
       }
       Programacion_II.Clave_murci.setText(a);
      
   }
    
}
