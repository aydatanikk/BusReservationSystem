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
public class UpdateBusTest {
    
    public UpdateBusTest() {
    }
    
 
    @Test
    public void testUpdateBus() {
        System.out.println("updateBus");
        int id = 1;
        String name = null;
        int timeHour = 2;
        int timeMin = 0;
        String to = "istanbul";
        String from = "ankara";
        boolean wireless = false;
        boolean tv = true;
        String journeyDate = "15.12.2016";
        String returnDate = "16.12.2016";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.updateBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
      
    }

      @Test
    public void testUpdateBus2() {
        System.out.println("updateBus");
        int id = 1;
        String name = "pamukkale";
        int timeHour = 2;
        int timeMin = 0;
        String to = "istanbul";
        String from = "istanbul";
        boolean wireless = true;
        boolean tv = true;
        String journeyDate = null;
        String returnDate = null;
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.updateBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
      
    }
    
       @Test
    public void testUpdateBus3() {
        System.out.println("updateBus");
        int id = -1;
        String name = "pamukkale";
        int timeHour = 2;
        int timeMin = 15;
        String to = "ankara";
        String from = "izmir";
        boolean wireless = true;
        boolean tv = true;
        String journeyDate = "15.12.2016";
        String returnDate = "16.12.2016";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.updateBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
      
    }

     
}
