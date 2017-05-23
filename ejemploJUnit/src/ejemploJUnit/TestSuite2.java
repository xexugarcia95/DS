package ejemploJUnit;

import org.junit.Test;

public class TestSuite2 {
	@Test(expected = ArithmeticException.class)
	public void testSum()
	{
			int x = 0;
			x = 1 / 0;
	}
	
	@Test(expected = Exception.class)
    public void testSubtract() throws Exception {
            throw new Exception();
  }
}
