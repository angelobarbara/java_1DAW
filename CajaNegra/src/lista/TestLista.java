/**
 * 
 */
package lista;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

/**
 * @author d17barba
 *
 */
public class TestLista {
	private Lista miCancion;
	Cancion cancion1 = new Cancion("aaa","aaa","123");
	Cancion cancion2 = new Cancion("bbb","bbb","123");
	Cancion cancion3 = new Cancion("ccc","ccc","123");
	Cancion cancion4 = new Cancion("ddd","ddd","123");
	
	@Before
	public void before() {
		miCancion = new Lista();
	}
	
	@After
	public void after() {
		miCancion = null;
	}
	
	@Test
	public void buscarPosicion() {
		miCancion.annadir(cancion1);
		miCancion.annadir(cancion2);
		miCancion.annadir(cancion3);
		Assert.assertEquals(cancion2, miCancion.buscar(1));
	}
	
	@Test
	public void buscar() {
		miCancion.annadir(cancion1);
		Assert.assertEquals(0, miCancion.buscar(cancion1));
	}
	
	@Test
	public void borrar() {
		miCancion.annadir(cancion1);
		Assert.assertEquals(true, miCancion.borrar(0));
	}
	
	@Test
	public void tamanno() {
		miCancion.annadir(cancion1);
		Assert.assertEquals(1, miCancion.tamanno());
	}
	
	@Test
	public void modificar() {
		miCancion.annadir(cancion1);
		miCancion.annadir(cancion2);
		miCancion.modificar(0, cancion2);
		Assert.assertEquals(cancion2, miCancion.buscar(0));
	}
	
	@Test
	public void annadirPosition() {
		miCancion.annadir(0, cancion1);
		Assert.assertEquals(cancion1, miCancion.buscar(miCancion.tamanno()-1));
	}
	
	@Test
	public void annadir() {
		miCancion.annadir(cancion1);
		Assert.assertEquals(cancion1, miCancion.buscar(0));
	}
	
	@Test
	public void vaciar() {
		miCancion.annadir(cancion1);
		miCancion.annadir(cancion2);
		miCancion.annadir(cancion3);
//		while(miCancion.estaVacia() == false)
//			miCancion.borrar(0);
		miCancion.vaciar();
		Assert.assertEquals(true, miCancion.estaVacia());
	}
}
