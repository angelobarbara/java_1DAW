package cajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

class TestCajaTest {
	
	private Cuenta cuenta;

	@Before
	void before() {
		cuenta = new Cuenta(5000);
	}
	
	@After
	void after() {
		cuenta = null;
	}
	
	@Test
	void testsaldoinicial() {
		Assert.assertEquals(5000, cuenta.getSaldo());
	}
	
	@Test
	void testIngreso() {
		cuenta.ingreso(500);
		Assert.assertEquals(5500, cuenta.getSaldo());
	}
	
	@Test
	void testReintegro() {
		cuenta.reintegro(500);
		Assert.assertEquals(4500, cuenta.getSaldo());
	}
	
	@Test
	void testTransferencia() {
		cuenta.transferencia(500, new Cuenta(1000));
		Assert.assertEquals(4500, cuenta.getSaldo());
	}
}
