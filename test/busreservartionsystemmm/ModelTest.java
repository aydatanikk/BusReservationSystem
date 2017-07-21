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
public class ModelTest {
    
    public ModelTest() {
    }
    

  
    @Test
    public void testBuySeat() {
        System.out.println("buySeat");
        int busId = 1;
        int seatId = 0;
        String name = "";
        String surname = "";
        int passengerId = 0;
        String mail = "";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.buySeat(busId, seatId, name, surname, passengerId, mail);
        assertEquals(expResult, result);
       
    }
    
    
     @Test
    public void testBuySea2t() {
        System.out.println("buySeat");
        int busId = 1;
        int seatId = 2;
        String name = null;
        String surname = null;
        int passengerId = 0;
        String mail = null;
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.buySeat(busId, seatId, name, surname, passengerId, mail);
        assertEquals(expResult, result);
       
    }

    
}
