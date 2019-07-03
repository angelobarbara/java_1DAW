package examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class TestAnimal {

	Animal animal;

	@Before
	public void before() {
		animal = new Animal(5, 10);
	}

	@Test
	public void set() {
		animal.setPeso(-5);
		Assert.assertEquals(1, animal.getPeso());
		animal.setPeso(20);
		Assert.assertEquals(10, animal.getPeso());
	}
	
	@Test
	public void constructor() {
		animal = new Animal(-4,10);
		Assert.assertEquals(1, animal.getPeso());
		animal = new Animal(30,10);
		Assert.assertEquals(10, animal.getPeso());
	}
	
	@Test
	public void engordar() {
		animal.engordar();
		Assert.assertEquals(6, animal.getPeso());
		animal.engordar();
		Assert.assertEquals(7, animal.getPeso());
		animal.engordar();
		Assert.assertEquals(8, animal.getPeso());
		animal.engordar();
		Assert.assertEquals(9, animal.getPeso());
		animal.engordar();
		Assert.assertEquals(10, animal.getPeso());
		animal.engordar();
		Assert.assertEquals(10, animal.getPeso());
	}
	
	@Test
	public void adelgazar() {
		animal.adelgazar();
		Assert.assertEquals(4, animal.getPeso());
		animal.adelgazar();
		Assert.assertEquals(3, animal.getPeso());
		animal.adelgazar();
		Assert.assertEquals(2, animal.getPeso());
		animal.adelgazar();
		Assert.assertEquals(1, animal.getPeso());
		animal.adelgazar();
		Assert.assertEquals(1, animal.getPeso());
		animal.adelgazar();
		Assert.assertEquals(1, animal.getPeso());
	}

}
