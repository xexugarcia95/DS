import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {
	
	@Test //Importante a la hora de realizar el test con JUnit
	public void sumaPositivos()
	{
		System.out.println("Sumando dos números positivos...\n");
		Suma s = new Suma(2,3);
		assertTrue(s.sumar() == 5);
	}
	
	@Test
	public void sumaNegativos()
	{
		System.out.println("Sumando dos números negativos...\n");
		Suma s = new Suma(-2,-3);
		assertTrue(s.sumar() == -5);
	}
	
	@Test
	public void sumaPositivoNegativo()
	{
		System.out.println("Sumando un número positivo y un número negativo...\n");
		Suma s = new Suma(2,-3);
		assertTrue(s.sumar() == -1);
	}
	
	
}
