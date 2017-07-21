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
public class BusSeat {
    
    private boolean available;
    private Passenger p;

    public BusSeat(boolean available, Passenger p) {
        this.available = available;
        this.p = p;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Passenger getP() {
        return p;
    }

    public void setP(Passenger p) {
        this.p = p;
    }

    public BusSeat() {
    }
    
    
    
}
