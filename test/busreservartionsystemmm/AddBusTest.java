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
public class AddBusTest {
    
    public AddBusTest() {
    }
    

    /**
     * Test of addBus method, of class Model.
     */
    @Test
    public void testAddBus1() {
        System.out.println("addBus");
        int id = 3;
        String name = "pamukkale";
        int timeHour = 2;
        int timeMin = 0;
        String to = "izmir";
        String from = "izmir";
        boolean wireless = false;
        boolean tv = false;
        String journeyDate = "14.12.2016";
        String returnDate = "15.12.2016";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.addBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
       
    }

    @Test
    public void testAddBus2() {
        System.out.println("addBus");
        int id =3 ;
        String name = "metro";
        int timeHour = 5;
        int timeMin = 15;
        String to = "izmir";
        String from = "istanbul";
        boolean wireless = false;
        boolean tv = false;
        String journeyDate = "13.12.2016";
        String returnDate = "14.12.2016";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.addBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
       
    }
    
     @Test
    public void testAddBus3() {
        System.out.println("addBus");
        int id =1 ;
        String name = "pamukkale";
        int timeHour = 7;
        int timeMin = 0;
        String to = "izmir";
        String from = "istanbul";
        boolean wireless = false;
        boolean tv = false;
        String journeyDate = "13.12.2016";
        String returnDate = "15.12.2016fs";
        Model instance = new Model();
        boolean expResult = true;
        boolean result = instance.addBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
        assertEquals(expResult, result);
       
    }


    
}
