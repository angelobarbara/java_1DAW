package listado3;
import utiles.*;
import java.util.ArrayList;

public class Pila<Prueba> {
ArrayList<Prueba> pilas = null;

Pila(){
	pilas = new ArrayList<Prueba>();
}

void push(Prueba element) {
	pilas.add(element);
}

Prueba pop(){
	if(pilas.size() == 0)
		return null;
	return pilas.remove(pilas.size()-1);
}

Prueba top() throws PilaEstaVaciaExeption {
//	if(pilas.size() == 0)
//		return null;
//	return pilas.get(pilas.size()-1);
	
	try {
		return pilas.get(pilas.size()-1);
	} catch (Exception e) {
		throw new PilaEstaVaciaExeption("La pila está vacia");
	}
}

boolean isEmpty() {
	if(pilas.size()==0)
		return true;
	return false;
}


}


