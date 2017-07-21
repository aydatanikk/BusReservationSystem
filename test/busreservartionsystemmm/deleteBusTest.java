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
public class deleteBusTest {
    
    public deleteBusTest() {
    }
   /**
     * Test of deleteBus method, of class Model.
     */
    @Test
    public void testDeleteBus() {
        System.out.println("deleteBus");
        int id = 0;
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.deleteBus(id);
        assertEquals(expResult, result);
     
    }

      @Test
    public void testDeleteBus2() {
        System.out.println("deleteBus");
        int id = -1;
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.deleteBus(id);
        assertEquals(expResult, result);
     
    }
    
}
