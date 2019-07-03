package estructuraDeDatosII;

public class TestEquals {
private int valor1;
private Integer valor2;

public boolean equals(Object o) {
	if(this==o)   // Primer paso.
		return true;
	if(!(o instanceof TestEquals))  // Segundo paso.
		return false;
	TestEquals param = (TestEquals)o;  // Tercer paso.
	return param.valor1 == valor1 && param.valor2.equals(valor2); 
	}
	
}
