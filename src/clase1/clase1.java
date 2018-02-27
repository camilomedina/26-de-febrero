/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

/**
 *
 * @author ASUS
 */
public class clase1 {
    public int numero=18;
    private double numero1=18.55;
    public float numero3=28;
    public String nombre="hola2";
       

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
