package tema2.conStatic;
public class TestPruebaStatic{
	public static void main (String[] args){
		PruebaStatic.valorEstatico*=2;
		PruebaStatic.valorEstatico++;//accedo al campo static sin crear algun objeto.
		System.out.println(PruebaStatic.valorEstatico);
	}
}