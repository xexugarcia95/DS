/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;


import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

import java.util.Vector;
import src.*;


/**
 *
 * @author Jesús Manuel García Palma
 * @correo xexugarcia95@gmail.com / jesusluisbcrespo@correo.ugr.es
 */
public class BolsaDineroTest extends TestCase {
    private Dinero f10CHF;
    private Dinero f12CHF;
    private Dinero f14CHF;
    private Dinero f16CHF;
    private BolsaDinero fMB1;
    private BolsaDinero fMB2;
    private BolsaDinero fMB3;
    private BolsaDinero fMB4;
    
    @Before
    public void setUp() throws Exception
    {
        f10CHF = new Dinero(10,"CHF");
        f12CHF = new Dinero(12,"CHF");
        f14CHF = new Dinero(14,"CHF");
        f16CHF = new Dinero(16,"CHF");
        
        Dinero[] fArray1 = {f10CHF,f12CHF,f16CHF};
        Dinero[] fArray2 = {f10CHF,f12CHF};
        
        
        fMB1 = new BolsaDinero(f10CHF,f12CHF);
        fMB2 = new BolsaDinero(fArray1);
        fMB3 = new BolsaDinero(fArray2);
        fMB4 = new BolsaDinero(fArray2);
        
    }
    
    @Test
    public void testEqualsBolsa()
    {
        testReflexiva();
        testSimetrica();
        testTransitiva();
    }
    
    @Test
    public void testAdd()
    {
        assertFalse(fMB1.BolsaEquals(fMB2.vector())); //Bolsas distintas
        BolsaDinero suma = (BolsaDinero) fMB1.add(f16CHF);
        assertTrue(suma.BolsaEquals(fMB2.vector())); // ¿Son las bolsas iguales?
    }
    
    public void testReflexiva()
    {
        assertTrue(fMB1.BolsaEquals(fMB1.vector()));
        assertTrue(fMB2.BolsaEquals(fMB2.vector()));
        assertTrue(fMB3.BolsaEquals(fMB3.vector()));
    }
    
    public void testSimetrica(){
        assertTrue(fMB1.BolsaEquals(fMB3.vector()));
        assertTrue(fMB3.BolsaEquals(fMB1.vector()));
        assertFalse(fMB1.BolsaEquals(fMB2.vector()));
        assertFalse(fMB2.BolsaEquals(fMB1.vector()));
    }
    
    public void testTransitiva()
    {
        assertTrue(fMB1.BolsaEquals(fMB3.vector()));
        assertTrue(fMB3.BolsaEquals(fMB4.vector()));
        assertTrue(fMB1.BolsaEquals(fMB4.vector()));
    }
    
    
}
