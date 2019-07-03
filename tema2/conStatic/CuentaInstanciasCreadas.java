package tema2.conStatic;
public class CuentaInstanciasCreadas {
	private static int contador=0;
	
	CuentaInstanciasCreadas(){
		setContador(getContador()+1);
	}
	
	private void setContador(int contador){
		CuentaInstanciasCreadas.contador=contador;
	}
	
	static int getContador(){
		return contador;
	}
}