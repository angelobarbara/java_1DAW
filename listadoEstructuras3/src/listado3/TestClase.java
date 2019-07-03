package listado3;

public class TestClase {
static ClaseConGenerics<String> listaPrueba = null;
public static void main(String[] args) {
	listaPrueba = new ClaseConGenerics<String>();
}
void sumar() {
	System.out.println(listaPrueba);
}
}
