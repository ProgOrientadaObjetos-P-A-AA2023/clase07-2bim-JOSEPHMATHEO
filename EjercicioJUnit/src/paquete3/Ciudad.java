/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Ciudad {
    
    private int poblacion;
    private String nombre;
    
    public void establecerNombre(String s){
    
        nombre = s;
    
    }
    public void establecerPoblacion(int d){
    
        poblacion = d;
    
    }
    
    public String obtenerNombre(){
    
        return nombre;
    
    }
    public int obtenerPoblacion(){
    
        return poblacion;
    
    }
    
    public String toString(){
    
        String expResult = String.format("Ciudad de Ecuador\n Nombre: %s\n\n\t"
                + "Población: %d\n",
                nombre,
                poblacion
                );
    
        return expResult;
    
    }
}
