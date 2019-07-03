package cajaNegra;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class CuentaTest {

	private Cuenta cuenta;
	
	@Before
	public void before() {
		cuenta = new Cuenta(5000);
	}
	
	@After
	public void after() {
		cuenta = null;
	}
	
	@Test
	public void testSaldoInicial() {
		Assert.assertEquals(5000, cuenta.getSaldo());
	}
	
	@Test
	public void testIngreso() {
		cuenta.ingreso(500);
		Assert.assertEquals(5500, cuenta.getSaldo());
	}
	
	@Test
	public void reintegro() {
		cuenta.reintegro(500);
		Assert.assertEquals(4500, cuenta.getSaldo());
	}
	
	@Test
	public void transferencia() {
		cuenta.transferencia(500, new Cuenta(1000));
		Assert.assertEquals(4500, cuenta.getSaldo());
	}
	
	@Test
	public void transferenciaFallo() {
		cuenta.transferencia(500, new Cuenta(2000));
		Assert.assertEquals(4000, cuenta.getSaldo());
	}

}
