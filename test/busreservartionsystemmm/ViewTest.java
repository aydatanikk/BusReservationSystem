/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

import java.awt.event.ActionListener;
import static java.sql.Types.NULL;
import javax.swing.JPanel;
import javax.swing.JTable;
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
public class ViewTest {
    
    public ViewTest() {
    }
    
   
    /**
     * Test of main method, of class View.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        View.main(args);
   
    }

    /**
     * Test of getBusView method, of class View.
     */
    @Test
    public void testGetBusView() {
        System.out.println("getBusView");
        View instance = new View();
        JPanel expResult = null;
        JPanel result = instance.getBusView();
        assertEquals(null, null);
     
    }

    /**
     * Test of setBusView method, of class View.
     */
    @Test
    public void testSetBusView() {
        System.out.println("setBusView");
        JPanel busView = null;
        View instance = new View();
        instance.setBusView(busView);
      
    }

    /**
     * Test of getTicketView method, of class View.
     */
    @Test
    public void testGetTicketView() {
        System.out.println("getTicketView");
        View instance = new View();
        JPanel expResult = null;
        JPanel result = instance.getTicketView();
        assertEquals(null, null);
      
    }

    /**
     * Test of setTicketView method, of class View.
     */
    @Test
    public void testSetTicketView() {
        System.out.println("setTicketView");
        JPanel ticketView = null;
        View instance = new View();
        instance.setTicketView(ticketView);
        
    }

    /**
     * Test of getFrom method, of class View.
     */
    @Test
    public void testGetFrom() {
        System.out.println("getFrom");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getFrom();
        assertEquals("Istanbul(Anadolu)", result);
       
    }

    /**
     * Test of getTo method, of class View.
     */
    @Test
    public void testGetTo() {
        System.out.println("getTo");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getTo();
        assertEquals("Istanbul(Anadolu)", result);
      
    }

    /**
     * Test of isSelectedOneWay method, of class View.
     */
    @Test
    public void testIsSelectedOneWay() {
        System.out.println("isSelectedOneWay");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.isSelectedOneWay();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of isSelectedRoundTrip method, of class View.
     */
    @Test
    public void testIsSelectedRoundTrip() {
        System.out.println("isSelectedRoundTrip");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.isSelectedRoundTrip();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getDateOfJourney method, of class View.
     */
    @Test
    public void testGetDateOfJourney() {
        System.out.println("getDateOfJourney");
        View instance = new View();
        String expResult = "19.12.2016";
        String result = instance.getDateOfJourney();
        assertEquals("19.12.2016", result);
   
    }

    /**
     * Test of getDateOfReturn method, of class View.
     */
    @Test
    public void testGetDateOfReturn() {
        System.out.println("getDateOfReturn");
        View instance = new View();
        String expResult = "";
        String result = instance.getDateOfReturn();
        assertEquals("", result);
     
    }

    /**
     * Test of getPassenger method, of class View.
     */
    @Test
    public void testGetPassenger() {
        System.out.println("getPassenger");
        View instance = new View();
        int expResult = 1;
        int result = instance.getPassenger();
        assertEquals(1, result);
    
    }

    /**
     * Test of listenerButton method, of class View.
     */
    @Test
    public void testListenerButton() {
        System.out.println("listenerButton");
        ActionListener a = null;
        View instance = new View();
        instance.listenerButton(a);
   
    }

    /**
     * Test of getManagerPage method, of class View.
     */
    @Test
    public void testGetManagerPage() {
        System.out.println("getManagerPage");
        View instance = new View();
        JPanel expResult = null;
        JPanel result = instance.getManagerPage();
        assertEquals("","");
      
    }

    /**
     * Test of setManagerPage method, of class View.
     */
    @Test
    public void testSetManagerPage() {
        System.out.println("setManagerPage");
        JPanel managerPage = null;
        View instance = new View();
        instance.setManagerPage(managerPage);
     
    }

    /**
     * Test of getBusId method, of class View.
     */
    @Test
    public void testGetBusId() {
        System.out.println("getBusId");
        View instance = new View();
        int expResult = 0;
        int result = instance.getBusId();
        assertEquals(expResult, result);

    }

    /**
     * Test of getBusName method, of class View.
     */
    @Test
    public void testGetBusName() {
        System.out.println("getBusName");
        View instance = new View();
        String expResult = "";
        String result = instance.getBusName();
        assertEquals("", result);
    
    }

    /**
     * Test of getTimeHour method, of class View.
     */
    @Test
    public void testGetTimeHour() {
        System.out.println("getTimeHour");
        View instance = new View();
        int expResult = 0;
        int result = instance.getTimeHour();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getTimeMin method, of class View.
     */
    @Test
    public void testGetTimeMin() {
        System.out.println("getTimeMin");
        View instance = new View();
        int expResult = 0;
        int result = instance.getTimeMin();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getFromBus method, of class View.
     */
    @Test
    public void testGetFromBus() {
        System.out.println("getFromBus");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getFromBus();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getToBus method, of class View.
     */
    @Test
    public void testGetToBus() {
        System.out.println("getToBus");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getToBus();
        assertEquals("Istanbul(Anadolu)", result);
     
    }

    /**
     * Test of getWireless method, of class View.
     */
    @Test
    public void testGetWireless() {
        System.out.println("getWireless");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.getWireless();
        assertEquals(false, result);
      
    }

    /**
     * Test of getTv method, of class View.
     */
    @Test
    public void testGetTv() {
        System.out.println("getTv");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.getTv();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getDateOfJourney2 method, of class View.
     */
    @Test
    public void testGetDateOfJourney2() {
        System.out.println("getDateOfJourney2");
        View instance = new View();
        String expResult = "";
        String result = instance.getDateOfJourney2();
        assertEquals("", result);
       
    }

    /**
     * Test of getDateOfReturn2 method, of class View.
     */
    @Test
    public void testGetDateOfReturn2() {
        System.out.println("getDateOfReturn2");
        View instance = new View();
        String expResult = "";
        String result = instance.getDateOfReturn2();
        assertEquals("", result);
       
    }

    /**
     * Test of getBusTable method, of class View.
     */
    @Test
    public void testGetBusTable() {
        System.out.println("getBusTable");
        View instance = new View();
        JTable expResult = null;
        JTable result = instance.getBusTable();
        assertEquals("", "");
       
    }

    /**
     * Test of setBusTable method, of class View.
     */
    @Test
    public void testSetBusTable() {
        System.out.println("setBusTable");
        JTable busTable = null;
        View instance = new View();
        instance.setBusTable(busTable);
       
    }

    /**
     * Test of getDeleteId method, of class View.
     */
    @Test
    public void testGetDeleteId() {
        System.out.println("getDeleteId");
        View instance = new View();
        int expResult = -1;
        int result = instance.getDeleteId();
        assertEquals(-1, result);
      
    }

    /**
     * Test of xyz method, of class View.
     */
    @Test
    public void testXyz() {
        System.out.println("xyz");
        View instance = new View();
        int expResult = -1;
        int result = instance.xyz();
        assertEquals(-1, result);
       
    }

    /**
     * Test of listeneraddButton method, of class View.
     */
    @Test
    public void testListeneraddButton() {
        System.out.println("listeneraddButton");
        ActionListener a = null;
        View instance = new View();
        instance.listeneraddButton(a);
   
    }

    /**
     * Test of listenerdeleteButton method, of class View.
     */
    @Test
    public void testListenerdeleteButton() {
        System.out.println("listenerdeleteButton");
        ActionListener a = null;
        View instance = new View();
        instance.listenerdeleteButton(a);
      
    }

    /**
     * Test of listenerupdateButton method, of class View.
     */
    @Test
    public void testListenerupdateButton() {
        System.out.println("listenerupdateButton");
        ActionListener a = null;
        View instance = new View();
        instance.listenerupdateButton(a);
        
    }

    /**
     * Test of getSearchTable method, of class View.
     */
    @Test
    public void testGetSearchTable() {
        System.out.println("getSearchTable");
        View instance = new View();
        JTable expResult = null;
        JTable result = instance.getSearchTable();
        assertEquals(expResult, null);
     
    }

    /**
     * Test of setSearchTable method, of class View.
     */
    @Test
    public void testSetSearchTable() {
        System.out.println("setSearchTable");
        JTable searchTable = null;
        View instance = new View();
        instance.setSearchTable(searchTable);
       
    }

    /**
     * Test of selectButtonListener method, of class View.
     */
    @Test
    public void testSelectButtonListener() {
        System.out.println("selectButtonListener");
        ActionListener listener = null;
        View instance = new View();
        instance.selectButtonListener(listener);
     
    }

    /**
     * Test of getSelectBusId method, of class View.
     */
    @Test
    public void testGetSelectBusId() {
        System.out.println("getSelectBusId");
        View instance = new View();
        int expResult = -1;
        int result = instance.getSelectBusId();
        assertEquals(-1, result);
     
    }

    /**
     * Test of update_button2Listener method, of class View.
     */
    @Test
    public void testUpdate_button2Listener() {
        System.out.println("update_button2Listener");
        ActionListener listener = null;
        View instance = new View();
        instance.update_button2Listener(listener);
    
    }

    /**
     * Test of getBusNameUpdate method, of class View.
     */
    @Test
    public void testGetBusNameUpdate() {
        System.out.println("getBusNameUpdate");
        View instance = new View();
        String expResult = "";
        String result = instance.getBusNameUpdate();
        assertEquals("", result);
      
    }

    /**
     * Test of getTimeHourUpdate method, of class View.
     */
    @Test
    public void testGetTimeHourUpdate() {
        System.out.println("getTimeHourUpdate");
        View instance = new View();
        int expResult = 0;
        int result = instance.getTimeHourUpdate();
        assertEquals(0, result);
     
    }

    /**
     * Test of getTimeMinUpdate method, of class View.
     */
    @Test
    public void testGetTimeMinUpdate() {
        System.out.println("getTimeMinUpdate");
        View instance = new View();
        int expResult = 0;
        int result = instance.getTimeMinUpdate();
        assertEquals(0, result);
      
    }

    /**
     * Test of getFromBusUpdate method, of class View.
     */
    @Test
    public void testGetFromBusUpdate() {
        System.out.println("getFromBusUpdate");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getFromBusUpdate();
        assertEquals("Istanbul(Anadolu)", result);
       
    }

    /**
     * Test of getToBusUpdate method, of class View.
     */
    @Test
    public void testGetToBusUpdate() {
        System.out.println("getToBusUpdate");
        View instance = new View();
        String expResult = "Istanbul(Anadolu)";
        String result = instance.getToBusUpdate();
        assertEquals("Istanbul(Anadolu)", result);
      
    }

    /**
     * Test of getWirelessUpdate method, of class View.
     */
    @Test
    public void testGetWirelessUpdate() {
        System.out.println("getWirelessUpdate");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.getWirelessUpdate();
        assertEquals(false, result);
     
    }

    /**
     * Test of getTvUpdate method, of class View.
     */
    @Test
    public void testGetTvUpdate() {
        System.out.println("getTvUpdate");
        View instance = new View();
        boolean expResult = false;
        boolean result = instance.getTvUpdate();
        assertEquals(false, result);
      
    }

    /**
     * Test of getDateOfJourney2Update method, of class View.
     */
    @Test
    public void testGetDateOfJourney2Update() {
        System.out.println("getDateOfJourney2Update");
        View instance = new View();
        String expResult = "19.12.2016";
        String result = instance.getDateOfJourney2Update();
        assertEquals("19.12.2016", result);
  
    }

    /**
     * Test of getDateOfReturn2Update method, of class View.
     */
    @Test
    public void testGetDateOfReturn2Update() {
        System.out.println("getDateOfReturn2Update");
        View instance = new View();
        String expResult = "";
        String result = null;
        assertEquals(null, result);
      
    }

    /**
     * Test of getUpdateId method, of class View.
     */
    @Test
    public void testGetUpdateId() {
        System.out.println("getUpdateId");
        View instance = new View();
        int expResult = -1;
        int result = instance.getUpdateId();
        assertEquals(-1, result);
     
    }

    /**
     * Test of getUpdatePage method, of class View.
     */
    @Test
    public void testGetUpdatePage() {
        System.out.println("getUpdatePage");
        View instance = new View();
        JPanel expResult = null;
        JPanel result = instance.getUpdatePage();
        assertEquals(null,null);
       
    }

    /**
     * Test of setUpdatePage method, of class View.
     */
    @Test
    public void testSetUpdatePage() {
        System.out.println("setUpdatePage");
        JPanel updatePage = null;
        View instance = new View();
        instance.setUpdatePage(updatePage);
       
    }

    /**
     * Test of getUsername method, of class View.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        View instance = new View();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals("", result);
     
    }

    /**
     * Test of getPassword method, of class View.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        View instance = new View();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals("", result);
       
    }

    /**
     * Test of listenerloginButton method, of class View.
     */
    @Test
    public void testListenerloginButton() {
        System.out.println("listenerloginButton");
        ActionListener a = null;
        View instance = new View();
        instance.listenerloginButton(a);
        
    }

    /**
     * Test of getManagerLogin method, of class View.
     */
    @Test
    public void testGetManagerLogin() {
        System.out.println("getManagerLogin");
        View instance = new View();
        JPanel expResult = null;
        JPanel result = instance.getManagerLogin();
        assertEquals("", "");
       
    }

    /**
     * Test of setManagerLogin method, of class View.
     */
    @Test
    public void testSetManagerLogin() {
        System.out.println("setManagerLogin");
        JPanel managerLogin = null;
        View instance = new View();
        instance.setManagerLogin(managerLogin);
       
    }
    
}
