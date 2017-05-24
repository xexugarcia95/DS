package test;

import src.IObservador;
import src.Observador;
import src.Sujeto;
import src.SujetoLista;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class SujetoTest {
	
	private Observador ob1;
	private Observador ob2;
	private ArrayList<IObservador> lista;
	private boolean err = false;
	private SujetoLista sujeto;
	
	@Before
	public void setUp()
	{
		System.out.println("Inicializando variables observadores...\n");
		ob1 = new Observador();
		ob2 = new Observador();
		lista = new ArrayList<IObservador>();
		sujeto = new SujetoLista();
		
		sujeto.insertar(ob1);
		sujeto.insertar(ob2);
		lista.add(ob1);
		System.out.println("Variables inicializadas\n");
	}
	
	@Test
	public void inicializacion()
	{
		System.out.println("Prueba de inicialización...\n");
		try{
			assertNotNull(ob1);
			assertNotNull(ob2);
			assertNotNull(lista);
			assertNotNull(sujeto);
			assertTrue(ob1 instanceof IObservador);
			assertTrue(ob2 instanceof IObservador);
			assertTrue(lista instanceof ArrayList);
			assertTrue(sujeto instanceof Sujeto);
			
			
		}catch(AssertionError e){
			System.err.println("Error al inicializar\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Inicialización correcta.\n");
	}
	
	@Test
	public void insertarObservador()
	{
		System.out.println("Insertando un nuevo observador...\n");
		
		try{
			
			assertFalse(lista.equals(sujeto.lista()));
			ArrayList<IObservador> otro = new ArrayList<IObservador>();
			otro = lista;
			otro.add(ob2);
			assertTrue(otro.equals(sujeto.lista()));
			
				
			}catch(AssertionError e){
				System.err.println("Error al insertar observador.\n");
				err = true;
				e.printStackTrace();
			}
		
		if(!err) System.out.println("Observador aÃ±adido correctamente a la lista\n");
		
	}
}
