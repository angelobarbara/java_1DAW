package listado3;

import java.util.ArrayList;

public class Cola<J> {
	ArrayList<J> cola = null;
	
	public Cola() {
		this.cola = new ArrayList<J>();
		
	}
	
	void annadir(J elemento) {
		cola.add(elemento);
	}
	
	J borrar(){
		if(cola.size() == 0)
			return null;
		return cola.remove(0);
	}

	J front() {
		if(cola.size() == 0)
			return null;
		return cola.get(0);
	}

	boolean isEmpty() {
		if(cola.size()==0)
			return true;
		return false;
	}
}
