package ControlVelocidad.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ControlVelocidad.src.Freno;

public class FrenoTest {
	
	private Freno freno;
	private boolean err;
	
	
	@Before
	public void setUp()
	{
		freno = new Freno();
		err = false;
	}
	
	@Test
	public void inicializacion()
	{
		assertNotNull(freno);
		assertTrue(freno instanceof Freno);
	}
	
	@Test
	public void testSoltarFreno()
	{
		System.out.println("Soltando freno...\n");
		try{
			assertEquals(freno.leerEstado(),false);
		}catch(AssertionError e){
			System.err.println("Error al soltar el freno\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Soltado de freno completado\n");
	}
	
	@Test
	public void testPisarFreno()
	{
		System.out.println("Pisando freno...\n");
		freno.presionarFreno();
		try{
			assertEquals(freno.leerEstado(),true);
		}catch(AssertionError e){
			System.err.println("Error al pisar el freno\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Pisado de freno completado\n");
	}
	
	
	//
	
	
}
