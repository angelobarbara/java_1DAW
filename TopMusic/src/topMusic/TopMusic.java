/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topMusic;

import java.util.ArrayList;

/**
 *
 * @author osterman
 */
public class TopMusic {
    private ArrayList<Musica> canciones = new ArrayList<Musica>();
//    private Musica musica = new Musica();
   private static final String INDICE_NO_VALIDO = "\nINTRODUZCA UN ÍNDICE VALIDO!\n";
    
    
    public Musica top(){
        return canciones.get(0);
    }
    
    public void bajarPuesto(int index) throws IndiceFueraDeRango{
        try {
            Musica tmp = canciones.get(index);
            canciones.set(index, canciones.get(index + 1));
            canciones.set(index + 1, tmp);
        } catch (Exception e) {
            throw new IndiceFueraDeRango("No se puede bajar la canción");
        }
    }
    
    
    public void subirPuesto(int index) throws IndiceFueraDeRango{
        try {
            Musica tmp = canciones.get(index);
            canciones.set(index, canciones.get(index - 1));
            canciones.set(index - 1, tmp);
        } catch (Exception e) {
            throw new IndiceFueraDeRango("No se puede subir la canción");
        }
    }
    
    public void add(String titulo, String author, int anno) {
        if(!contains(titulo, author, anno))
            canciones.add(new Musica(titulo, author, anno));
    }
    
    public void add(int index, String titulo, String author, int anno) throws IndiceFueraDeRango{
        if(!contains(titulo, author, anno)){
            try {
                canciones.add(index, new Musica(titulo, author, anno));
            } catch (Exception e) {
                throw new IndiceFueraDeRango(INDICE_NO_VALIDO);
            }
        }
    }
    
//    public void set(int index,String titulo, String author, int anno) throws IndiceFueraDeRango{
//        if(!contains(titulo, author, anno)){
//            try {
//                canciones.set(index, new Musica(titulo, author, anno));
//            }catch (IndexOutOfBoundsException e){
//                throw new IndiceFueraDeRango(string);
//            }
//        }
//    }

    public boolean contains(String titulo, String author, int anno) {
//        for(Musica musica : canciones)
//            if(musica.getNombre().equals(titulo) && musica.getAuthor().equals(author))
//                return true;
//        return false;
          return canciones.contains(new Musica(titulo, author, anno));
            
//        return canciones.contains();
    }
    
    
    public Musica get(int index) throws IndiceFueraDeRango{
        try {
            return canciones.get(index);
        } catch (Exception e) {
            throw new IndiceFueraDeRango(INDICE_NO_VALIDO);
        }
    }
    
    public boolean isEmpty(){
        return canciones.isEmpty();
    }
    
    public int size(){
        return canciones.size()+1;
    }
    
    public int sizeRemove(){
        return canciones.size();
    }
    
    public Musica remove(int index) throws IndiceFueraDeRango{
        try {
            return canciones.remove(index);
        } catch (Exception e) {
            throw new IndiceFueraDeRango(INDICE_NO_VALIDO);
        }
    }
    
    @Override
    public String toString() {
        int i = 1;
        StringBuilder cadena = new StringBuilder();
        cadena.append("\nTOPMUSIC\n");
        for(Musica musica : canciones){
            cadena.append("\n"+i+". "+musica + "\n");
            i++;
        }
        return cadena.toString();
            
    }
}
