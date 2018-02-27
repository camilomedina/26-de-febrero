/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author ASUS
 */
public class clase2 {
     public int numero=15;
    private double numero1=13.55;
    public float numero3=2;
    public String nombre="hola1";
   
    
    
    public String publico1(){
        return nombre;
    }
    public float publico2(){
        return numero3;
    }
    public int publico3(){       
         return numero;
    }
     private float privado(){
        return numero3;        
         
    }
}
