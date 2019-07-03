package CajaBlanca;
import utiles.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class MayorMenorCero {

	public static void main(String[] args) throws IOException {
		BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
			
		do {
			System.out.println("Introduzca un número");
			int num = Integer.parseInt(bReader.readLine().trim());

			if(num<0)
				System.out.println("Es negativo");
			else if(num>0)
				System.out.println("Es positivo");
			else System.out.println("Es cero");
		}while(Teclado.deseaContinuar());

	}

}
