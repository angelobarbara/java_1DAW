package exception;

public class TestCapturaMiExcepcion {
    public static void main(String[] args) {
        metodo1();
        System.out.println("main: Acabado...");

    }

    private static void metodo1() {
        metodo2();
        System.out.println("Metodo1: Acabado...");
    }

    private static void metodo2() {
        try {
            String nula = null;
            nula.toString();
            System.out.println("Metodo2: Acabado...");
        } catch (Exception e) {
            System.out.println("Mi primera excepcion");
        }

    }
}
