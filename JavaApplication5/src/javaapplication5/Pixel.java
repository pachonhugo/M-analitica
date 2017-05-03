/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Estudiantes
 */
public class Pixel {
    
    int rojo;
    int verde;
    int azul;
    
    int validar(int x){
        if(x<0||x>255){
            x=128;
            
        }
        return x;
    }

    public int getRojo() {
        
        return rojo;
    }

    public void setRojo(int rojo) {
        
        this.rojo=validar(rojo);
        this.rojo = rojo;
    }

    public int getVerde() {
        return verde;
    }

    public void setVerde(int verde) {
        
        this.verde=validar(verde);
        this.verde = verde;
    }

    public int getAzul() {
        return azul;
    }

    public void setAzul(int azul) {
        
        this.azul=validar(azul);
        this.azul = azul;
    }
    
    
    
    
}
