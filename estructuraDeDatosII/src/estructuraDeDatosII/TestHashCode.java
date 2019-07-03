package estructuraDeDatosII;

public class TestHashCode {
private int valor1;
private Integer valor2; 
public int hashCode() {
StringBuffer buffer = new StringBuffer();
buffer.append(Integer.toString(valor1));
buffer.append(valor2.toString());
return buffer.toString().hashCode();
	}

}
