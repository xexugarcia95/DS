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
	private List<Observador> lista;
	private boolean err = false;
	
	@Before
	public void setUp()
	{
		System.out.println("Inicializando variables observadores...\n");
		ob1 = new Observador();
		ob2 = new Observador();
		lista = new ArrayList<Observador>();
		System.out.println("Variables inicializadas\n");
	}
	
	@Test
	public void inicializacion()
	{
		
	}
	
	@Test
	public void insertarObservador()
	{
		System.out.println("Insertando un nuevo observador...\n");
		
		try{
			
			}catch(AssertionError e){
				System.err.println("Error al insertar observador.\n");
				err = true;
				e.printStackTrace();
			}
		
		if(!err) System.out.println("Observador añadido correctamente a la lista\n");
		
	}
}
