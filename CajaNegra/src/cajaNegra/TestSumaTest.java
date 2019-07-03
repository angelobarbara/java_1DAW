package cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestSumaTest {
	
	@Test
	void testPositivos() {			//suma dos números positivos
		Suma suma = new Suma(3, 2);
		Assert.assertEquals(5, suma.sumar());
	}
	
	@Test
	void testPositivoNegativo() {		//suma un número positivo y uno negativo
		Suma suma = new Suma(3, -2);
		Assert.assertEquals(1, suma.sumar());
	}
	
	@Test
	void testNegativos() {			//suma dos números negativos
		Suma suma = new Suma(-3, -2);
		Assert.assertEquals(-5, suma.sumar());
	}
	
	@Test
	void testNegativoPositivo() {			//suma dos números positivos
		Suma suma = new Suma(-3, 2);
		Assert.assertEquals(-1, suma.sumar());
	}
	
}
