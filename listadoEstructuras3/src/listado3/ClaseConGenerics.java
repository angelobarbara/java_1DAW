package listado3;

import java.util.ArrayList;

public class ClaseConGenerics<Prueba> {

private ArrayList<Prueba> lista = null;

public ClaseConGenerics() {
	this.lista = new ArrayList<Prueba>(); 
	
}

void sumar(Prueba elemento) {
	lista.add(elemento);
}

Prueba buscar(int posicion) {
	if(fueraDeRango(posicion))
		return null;
	return lista.get(posicion);
}

private boolean fueraDeRango(int posicion) {
	// TODO Auto-generated method stub
	return false;
}

}
