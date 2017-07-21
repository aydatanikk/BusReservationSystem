/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

/**
 *
 * @author Ayda
 */
public class Test {
    
    public static void main(String[] args) {
        Model m = new Model();
        View v = new View();
        // m.readFile();
         //m.readSeatFile();
        Controller c = new Controller(m, v);
        v.setVisible(true);
       
        
    }
    
}
