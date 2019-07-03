package tema2.conStatic;
public class TestCuentaInstanciasCreadas{
	public static void main (String[] args){
		CuentaInstanciasCreadas  p1= new CuentaInstanciasCreadas ();
		CuentaInstanciasCreadas  p2=new CuentaInstanciasCreadas ();
		CuentaInstanciasCreadas  p3=new CuentaInstanciasCreadas ();
		CuentaInstanciasCreadas  p4=new CuentaInstanciasCreadas ();
		System.out.println(CuentaInstanciasCreadas.getContador());
	}
}