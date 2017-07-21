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
public class Bus {
    private int Id;
    private String name;
    private int timeHour;
    private int timeMin;
    private String to;
    private String from;
    private boolean wireless;
    private boolean tv;
    private String journeyDate;
    private String returnDate;
    private BusSeat[] seats;

    public Bus() {
    }

    
    public BusSeat[] getSeats() {
        return seats;
    }

    public void setSeats(BusSeat[] seats) {
        this.seats = seats;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimeHour() {
        return timeHour;
    }

    public void setTimeHour(int timeHour) {
        this.timeHour = timeHour;
    }

    public int getTimeMin() {
        return timeMin;
    }

    public void setTimeMin(int timeMin) {
        this.timeMin = timeMin;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Bus(int Id, String name, int timeHour, int timeMin, String to, String from, boolean wireless, boolean tv, String journeyDate, String returnDate) {
        this.Id = Id;
        this.name = name;
        this.timeHour = timeHour;
        this.timeMin = timeMin;
        this.to = to;
        this.from = from;
        this.wireless = wireless;
        this.tv = tv;
        this.journeyDate = journeyDate;
        this.returnDate = returnDate;
        this.seats=new BusSeat[32];
    }

    @Override
    public String toString() {
        return "Bus{" + "Id=" + Id + ", name=" + name + ", timeHour=" + timeHour + ", timeMin=" + timeMin + ", to=" + to + ", from=" + from + ", wireless=" + wireless + ", tv=" + tv + ", journeyDate=" + journeyDate + ", returnDate=" + returnDate + '}';
    }
    

    
    
    
}
