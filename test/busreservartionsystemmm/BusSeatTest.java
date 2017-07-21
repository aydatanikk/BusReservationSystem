/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ayda
 */
public class BusSeatTest {
    
    public BusSeatTest() {
    }
    
   

    /**
     * Test of isAvailable method, of class BusSeat.
     */
    @Test
    public void testIsAvailable() {
        System.out.println("isAvailable");
        BusSeat instance = new BusSeat();
        boolean expResult = false;
        boolean result = instance.isAvailable();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setAvailable method, of class BusSeat.
     */
    @Test
    public void testSetAvailable() {
        System.out.println("setAvailable");
        boolean available = true;
        BusSeat instance = new BusSeat();
        instance.setAvailable(available);
  
    }

    /**
     * Test of getP method, of class BusSeat.
     */
    @Test
    public void testGetP() {
        System.out.println("getP");
        BusSeat instance = new BusSeat();
        Passenger expResult = null;
        Passenger result = instance.getP();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of setP method, of class BusSeat.
     */
    @Test
    public void testSetP() {
        System.out.println("setP");
        Passenger p = null;
        BusSeat instance = new BusSeat();
        instance.setP(p);
      
    }
    
}
