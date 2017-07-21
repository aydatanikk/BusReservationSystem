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
public class BuySeatTest {
    
    public BuySeatTest() {
    }
    
   
    @Test
    public void testBuySeat() {
        System.out.println("buySeat");
        int busId = 1;
        int seatId = 0;
        String name = "Ayda";
        String surname = "Tanık";
        int passengerId = 42412;
        String mail = "bbdsbsd";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.buySeat(busId, seatId, name, surname, passengerId, mail);
        assertEquals(expResult, result);
     
    }

    @Test
    public void testBuySeat2() {
        System.out.println("buySeat");
        int busId = 1;
        int seatId = 60;
        String name = "Ayda";
        String surname = "Tanık";
        int passengerId = 42412523;
        String mail = "bbdsbsd";
        Model instance = new Model();
        boolean expResult = false;
        boolean result = instance.buySeat(busId, seatId, name, surname, passengerId, mail);
        assertEquals(expResult, result);
     
    }
    
}
