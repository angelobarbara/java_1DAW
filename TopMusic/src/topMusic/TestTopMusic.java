/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topMusic;
import utiles.*;

/**
 *
 * @author osterman
 */
public class TestTopMusic {
    private static TopMusic music = new TopMusic();
    
    public static void main(String[] args) {
        Menu menu = new Menu("TopMusic", new String[]{"Añadir en la última posición",
        "Añadir en una posición determinada","Sacar elemento","Subir puesto",
        "Bajar puesto","Mostrar lista canciones","Mostrar la canción más escuchada",
        "Borrar elemento"});
        
        int opcion = 0;
        
        do{
           opcion = menu.gestionar();
           gestionar(opcion);
        }while(opcion != menu.getSalir());
    }

    

    private static void gestionar(int opcion) {
        if(music.isEmpty() && opcion != 1 && opcion != 9){
            System.err.println("\nINTRODUZCA AL MENOS UNA CANCIÓN");
            return;
        }
        try {
            switch (opcion) {
                case 1:
                    add();
                    break;
                case 2:
                    addPosicion();
                    break;
                case 3:
                    get();
                    break;
                case 4:
                    subir();
                    break;
                case 5:
                    bajar();
                    break;
                case 6:
                    mostrar();
                    break;
                case 7:
                    mostrarTop();
                    break;
                case 8:
                    remove();
                    break;
                default:
                    break;
            }
        } catch (IndiceFueraDeRango e) {
            System.err.println(e.getMessage());
        }
    }

    private static void add() {
        music.add(pedirTitulo(), pedirAuthor(), pedirAnno());
    }
    
    private static int pedirAnno(){
        int anno = TecladoScanner.leerEntero("\nIntroduzca un anño");
        return anno;
    }
    
    private static String pedirAuthor(){
        String author = TecladoScanner.leerCadena("\nIntroduzca un author");
        return author;
    }
    
    private static String pedirTitulo(){
        String titulo = TecladoScanner.leerCadena("\nIntroduzca un título");
        return titulo;
    }

    private static void addPosicion() throws IndiceFueraDeRango {
        System.out.println("\nINTRODUZCA UNA POSICIÓN ENTRE 1 Y "+music.size()+"\n");
//        try {
            music.add(recogerIndice(), pedirTitulo(), pedirAuthor(), pedirAnno());
//        } catch (IndiceFueraDeRango e) {
//            System.err.println(e.getMessage());
//        }
    }

    private static int recogerIndice() {
        int index = TecladoScanner.leerEntero("\nIntroduzca una posición")-1;
        return index;
    }

    private static void get() throws IndiceFueraDeRango {
        System.out.println("Introduzca una posición entre 1 y "+music.size());
//        try {
            System.out.println(music.get(recogerIndice()));
//        } catch (IndiceFueraDeRango e) {
//            System.err.println(e.getMessage());
//        }
    }

    private static void subir() throws IndiceFueraDeRango {
        mostrar();
//        try {
            music.subirPuesto(recogerIndice());
//        } catch (IndiceFueraDeRango e) {
//           System.err.println(e.getMessage());
//        }
    }

    private static void bajar() throws IndiceFueraDeRango {
        mostrar();
//        try {
            music.bajarPuesto(recogerIndice());
//        } catch (IndiceFueraDeRango e) {
//            System.err.println(e.getMessage());
//        }
    }
    
    private static void mostrar(){
        System.out.println(music.toString());
    }

    private static void mostrarTop() {
        System.out.println(music.top());
    }

    private static void remove() throws IndiceFueraDeRango {
        System.out.println("Introduzca una posición entre 1 y "+music.sizeRemove());
//        try {
            System.out.println(music.remove(recogerIndice())+" ha sido borrada");
//        } catch (IndiceFueraDeRango e) {
//            System.err.println(e.getMessage());
//        }
    }
}
