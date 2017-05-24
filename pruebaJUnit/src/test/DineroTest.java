package test;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import src.BolsaDinero;
import src.Dinero;
import src.IDinero;

public class DineroTest extends TestCase
{
    private Dinero f10CHF;
    private Dinero f12CHF;
    private Dinero f14CHF;
    private Dinero f16CHF;
    private Dinero f18CHF;
    
    
    @Before
    protected void setUp() throws Exception
    {
        f10CHF = new Dinero(10,"CHF");
        f12CHF = new Dinero(12,"CHF");
        f14CHF = new Dinero(14,"CHF");
        f16CHF = new Dinero(16,"CHF");
        f18CHF = new Dinero(18,"CHF");
    }
    
    @Test
    public void testAdd()
    {
       IDinero sumaIgual = f12CHF.add(f14CHF);
       IDinero distintos = f10CHF.add(f14CHF);
       
       assertTrue(sumaIgual instanceof Dinero);
       assertEquals(((Dinero) sumaIgual).cantidad(),26);
       assertEquals(((Dinero) sumaIgual).moneda(),"CHF");
       
       assertTrue(distintos instanceof BolsaDinero);
    }
    
    @Test
    public void testEquals()
    {
       testReflexiva();
       testSimetrica();
       testTransitiva();
    }
    
    public void testReflexiva()
    {
        assertEquals(f12CHF,f12CHF);
        assertEquals(f14CHF,f14CHF);
    }
    
    public void testSimetrica()
    {
        assertEquals(f12CHF,f14CHF);
        assertEquals(f14CHF,f12CHF);
        assertFalse(f12CHF.equals(f10CHF));
        assertFalse(f10CHF.equals(f12CHF));
        assertFalse(f12CHF.equals(f16CHF));
        assertFalse(f16CHF.equals(f12CHF));
    }
    
    public void testTransitiva()
    {
       assertEquals(f10CHF,f12CHF);
       assertEquals(f12CHF,f14CHF);
       assertEquals(f10CHF,f14CHF);
    }
    
    
}
