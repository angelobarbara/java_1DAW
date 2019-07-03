public class ParametrosReferencia {
 
    public static void main(String[] args) {
        Persona p = new Persona(); //creamos un objeto
        p.setNombre("Diego"); //le asignamos un valor
        System.out.println("El nombre antes del método es:" + p.getNombre()); //mostramos el valor
        cambiarNombre(p);//llamamos a un método para que cambie de valor
        System.out.println("El nombre después del método es:" + p.getNombre()); //mostramos el nuevo valor
    }
 
    private static void cambiarNombre(Persona p) {
        p.setNombre("Santiago"); //aqui tendrá otro valor
    }
}
 
