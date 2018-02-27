/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;
import clase1.clase1;
import clase2.clase2;
import clase3.clase3;

/**
 *
 * @author ASUS
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clase1 objeto1= new clase1();
        clase2 objeto2= new clase2();
        clase3 objeto3= new clase3();
        
        objeto1.publico1();
        objeto1.publico2();
        objeto1.publico3();
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Respuesta del metodo publico de la clase Clase1 : "+objeto1.publico1());
        System.out.println("Respuesta del metodo publico de la clase Clase1 : "+objeto1.publico2());
        System.out.println("Respuesta del metodo publico de la clase Clase1:  "+objeto1.publico3());
        System.out.println("Metodo toString: "+objeto1.toString());
        
        objeto2.publico1();
        objeto2.publico2();
        objeto2.publico3();
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Respuesta del metodo publico de la clase Clase2 : "+objeto2.publico1());
        System.out.println("Respuesta del metodo publico de la clase Clase2 : "+objeto2.publico2());
        System.out.println("Respuesta del metodo publico de la clase Clase2:  "+objeto2.publico3());
        System.out.println("Metodo toString: "+objeto2.toString());
        
        
        objeto3.publico1();
        objeto3.publico2();
        objeto3.publico3();
        
        
        System.out.println("------------------------------------------------------------");
        System.out.println("Respuesta del metodo publico de la clase Clas3 : "+objeto3.publico1());
        System.out.println("Respuesta del metodo publico de la clase Clase3 : "+objeto3.publico2());
        System.out.println("Respuesta del metodo publico de la clase Clase3:  "+objeto3.publico3());
        System.out.println("Metodo toString: "+objeto3.toString());
    }
    
}
