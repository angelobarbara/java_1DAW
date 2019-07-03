/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concesionario;

/**
 *
 * @author Angelo Barbara
 */
public enum Color {
    PLATA, ROJO, AZUL;
        
    public static String[] menuColor(){
        String[] opciones = new String[Color.values().length];
        int i = 0;
        
        for(Color color : Color.values())
            opciones[i++] = color.toString();
        
        return opciones;
    }
}
