package ejemplo2JUnit;

import static org.junit.Assert.*;
import org.junit.Test;

	 
public class pruebaTest {
	
	@Test
	public void testSuma()
	{
		assertEquals(4,2+2);
		assertEquals(2,2+0);
		assertEquals(2,0+2);
	}
	
}
