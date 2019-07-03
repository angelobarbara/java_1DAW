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
public enum Modelo {

    /**
     *
     */
    SERIE1(Marca.BMW),
    SERIE2(Marca.BMW),
    SERIE3(Marca.BMW),
    SERIE4(Marca.BMW),
    SERIE5(Marca.BMW),
    CORDOBA(Marca.SEAT),
    IBIZA(Marca.SEAT),
    TOLEDO(Marca.SEAT);
    
    private Marca marca;
    
    private Modelo(Marca marca) {
        this.marca = marca;
    }
    
    public Marca getMarca(){
        return marca;

    }
    
    public static String[] menuModelos(){
        String[] modelos = new String[Modelo.values().length];
        int i = 0;
        for(Modelo modelo : Modelo.values())
            modelos[i++] = modelo.toString();
        return modelos;
    }
}
