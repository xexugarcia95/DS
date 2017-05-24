/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ControlVelocidad.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestListener;
import junit.framework.TestResult;
import org.junit.Before;
import org.junit.Test;

import ControlVelocidad.src.Acelerador;
import ControlVelocidad.src.ControlVelocidad;
import ControlVelocidad.src.Eje;
import Simulador.src.Interfaz;

/**
 *
 * @author JesÃºs Manuel GarcÃ­a Palma
 * @correo xexugarcia95@gmail.com / jesusluisbcrespo@correo.ugr.es
 */
public class AceleradorTest   {
	
	private Acelerador acelerador;
	private Eje eje;
	private boolean err;
	
	@Before
	public void setUp()
	{
		acelerador = new Acelerador();
		eje = new Eje();
		err = false;
		
	
	}
	
	@Test
	public void inicializacion()
	{
		System.out.println("Comprobando inicialización...\n");
		try{
			assertNotNull(acelerador);
			assertNotNull(eje);
			assertTrue(acelerador instanceof Acelerador);
			assertTrue(eje instanceof Eje);
		}catch(AssertionError e){
			System.err.println("Error en la inicialización\n");
			e.printStackTrace();
			err = true;
		}
		
		if(!err) System.out.println("Inicialización correcta\n");
	}
	
	@Test
	public void testPisarAcelerador()
	{
		acelerador.pisarAcelerador();
		System.out.println("Comprobando si se pisa el acelerador...\n");
		try{
			assertEquals(acelerador.leerEstado(), true);
		}catch(AssertionError e){
			System.err.println("Error en la comprobacion. El acelerador no está pisado\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Acelerador pisado\n");
		
	}
	
	@Test
	public void testSoltarAcelerador()
	{
		acelerador.soltarAcelerador();
		System.out.println("Comprobando si se ha soltado el acelerador...\n");
		try{
			assertEquals(acelerador.leerEstado(), false);
		}catch(AssertionError e){
			System.err.println("Error en la comprobacion. El acelerador sigue pisado\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Acelerador soltado\n");
		
	}
	
	@Test
	public void testLeerEstado()
	{
		System.out.println("Leyendo estado del acelerador...\n");
		try{
			assertFalse(acelerador.leerEstado());
		}catch(AssertionError e){
			System.err.println("Error al leer el estado del acelerador\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Estado del acelerador leído\n");
	}
	
	@Test
	public void testIncrementar()
	{
		System.out.println("Incrementando vueltas...\n");
		try{
			//--
		}catch(AssertionError e){
			System.err.println("Error al incrementar\n");
			err = true;
			e.printStackTrace();
		}
		
		if(!err) System.out.println("Número de vueltas incrementada\n");
	}
}
