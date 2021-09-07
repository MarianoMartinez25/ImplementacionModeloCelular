/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android.app;

/**
 *
 * @author Mariano
 */
public class Activity {

    protected void onCreate(){
        System.out.println("Salida del metodo onCreate de la clase Activity");
    }
        
    public void MostrarDatos(){
        onCreate();
    }
    
}
