package ejemploJUnit;

import org.junit.Test;

public class TestSuite1 {
	@Test
	public void testSum()
	{
		assert 1+1 == 2 : "Suma incorrecta";	
	}
	
	@Test
	public void testSubstract()
	{
		assert 1 - 1 == 0;
	}
}
