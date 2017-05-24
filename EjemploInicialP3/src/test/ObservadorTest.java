package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.IObservador;
import src.Observador;
import src.Sujeto;
import src.SujetoLista;

public class ObservadorTest {
	
	private Sujeto s;
	private Observador o;
	private boolean llamada;
	private boolean err;
	
	@Before
	public void setUp()
	{
		System.out.println("Llamando al setUp...\n");
		s = new SujetoLista();
		o = new Observador();
		llamada = false;
		err = false;
	}
	
	@Test
	public void inicializacion()
	{
		try{
		System.out.println("Inicializacion...\n");
		assertNotNull(s);
		assertNotNull(o);
		assertTrue(s instanceof Sujeto);
		assertTrue(o instanceof IObservador);
		}catch(AssertionError e){
			System.err.println("Error al inicializar\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Todo correcto.\n");
		
	}
	
	@Test 
	public void actualizarTest()
	{
		System.out.println("Actualizando test...\n");
		try{
			llamada = true;
			Observador aux = new Observador();
			aux.actualizar(s);
			assertEquals(((Observador) aux).actualizarLlamado(),llamada);
		}catch(AssertionError e){
			System.err.println("Fallo al actualizar.\n");
			e.printStackTrace();
			err = true;
			
		}
		
		if(!err) System.out.println("Actualizado correcto.\n");
	}
}
