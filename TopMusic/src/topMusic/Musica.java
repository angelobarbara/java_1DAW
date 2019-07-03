/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topMusic;

import java.util.Objects;

/**
 *
 * @author osterman
 */
public class Musica {
    private String nombre;
    private String author;
    private int anno;
    
    Musica(){
        super();
    }
    
    Musica(String nombre){
        setNombre(nombre);
    }
    
    Musica(String nombre,String author,int anno){
        setNombre(nombre);
        setAuthor(author);
        setAnno(anno);
    }

    @Override
    public String toString() {
        return "Musica{" + "nombre=" + nombre + ", author=" + author + ", anno=" + anno + '}';
    }
    
    public void setAnno(int anno){
        this.anno = anno;
    }
    
    public void setAuthor(String author){
        this.author = author;
    }
    
    public int getAnno(){
        return anno;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        hash = 29 * hash + Objects.hashCode(this.author);
        hash = 29 * hash + this.anno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        if (this.anno != other.anno) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.author, other.author)) {
            return false;
        }
        return true;
    }
    
    
            
}
