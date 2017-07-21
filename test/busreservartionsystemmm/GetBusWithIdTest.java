/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

import java.util.ArrayList;
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
public class GetBusWithIdTest {
    
    public GetBusWithIdTest() {
    }
    
  
    @Test
    public void testGetBusWithId() {
        System.out.println("getBusWithId");
        int id = 0;
        Model instance = new Model();
        Bus expResult = null;
        Bus result = instance.getBusWithId(id);
        assertEquals(expResult, result);
      
    }

       @Test
    public void testGetBusWithId2() {
        System.out.println("getBusWithId");
        int id = 21;
        Model instance = new Model();
        Bus expResult = null;
        Bus result = instance.getBusWithId(id);
        assertEquals(expResult, result);
      
    }
    
}
