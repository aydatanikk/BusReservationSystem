/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Ayda
 */
public class Model {

    ArrayList<Bus> busList = new ArrayList<>();
/*
    public void writeToFile() {
        StringBuilder sb = new StringBuilder();

        try {
            File file = new File("BusText.txt");
            if (file.isFile()) {
                System.out.println("true");
            }
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            PrintWriter out = new PrintWriter("BusText.txt");
            String text = "";           
            for (Bus b : busList) {
                BusSeat[] arr = b.getSeats();

                

                text = text + b.getId() + ";" + b.getName() + ";" + b.getTimeHour() + ";" + b.getTimeMin() + ";" + b.getTo() + ";"
                        + b.getFrom() + ";" + b.isWireless() + ";" + b.isTv() + ";" + b.getJourneyDate() + ";"
                        + b.getReturnDate() + ":";
                

                sb.append(text);
            }

            out.write(text);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeToSeatFile(){
         StringBuilder sb = new StringBuilder();

        try {
            File file = new File("SeatText.txt");
            if (file.isFile()) {
                System.out.println("true");
            }
            BufferedWriter output = new BufferedWriter(new FileWriter(file));
            PrintWriter out = new PrintWriter("SeatText.txt");
            String text = "";           
            for (Bus b : busList) {
                BusSeat[] arr = b.getSeats();
                
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i].getP()!=null){
                        Passenger p =arr[i].getP();
                        text=text+arr[i].isAvailable()+";"+p.getName()+";"+p.getSurname()+";"+p.getId()+";"+p.getMail()+":";
                    } else{
                        text=text+arr[i].isAvailable()+":";
                    }
                    
                }
                text=text+"-";
                                            
                sb.append(text);
            }

            out.write(text);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile() {
        try {
            File file = new File("BusText.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ":");
                while (st.hasMoreTokens()) {
                    StringTokenizer st1 = new StringTokenizer(st.nextToken(), ";");                                   
                    Bus b = new Bus();
                    b.setId(Integer.parseInt(st1.nextToken()));
                    b.setName(st1.nextToken());
                    b.setTimeHour(Integer.parseInt(st1.nextToken()));
                    b.setTimeMin(Integer.parseInt(st1.nextToken()));
                    b.setTo(st1.nextToken());
                    b.setFrom(st1.nextToken());
                    if (st1.nextToken().equals("true")) {
                        b.setWireless(true);
                    } else {
                        b.setWireless(false);
                    }
                    if (st1.nextToken().equals("true")) {
                        b.setTv(true);
                    } else {
                        b.setTv(false);
                    }
                    b.setJourneyDate(st1.nextToken());
                    b.setReturnDate(st1.nextToken());                                                           
                    busList.add(b);
                }
            }
            br.close();
        } catch (Exception e) {
        }
    }
    
    public void readSeatFile(){
         try {
            File file = new File("SeatText.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            int j=0;
            while ((line = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, "-");
                
                while (st.hasMoreTokens()) {
                    int i=0;
                    BusSeat[] seats= new BusSeat[32];
                    StringTokenizer st1 = new StringTokenizer(st.nextToken(), ":");
                    while(st1.hasMoreTokens()){
                        StringTokenizer st2 = new StringTokenizer(st1.nextToken(), ";");
                            if(st2.nextToken().equals("true")){
                                seats[i].setAvailable(true);
                            }else{
                                seats[i].setAvailable(false);
                            }
                            i++;
                    }
                    busList.get(j).setSeats(seats);
                   j++;
                }
               
            }
            br.close();
        } catch (Exception e) {
        }
    }
    */
    public boolean buySeat(int busId, int seatId, String name, String surname, int passengerId, String mail) {
        for (Bus bus : busList) {
            if (bus.getId() == busId) {
                if (bus.getSeats()[seatId].isAvailable()) {
                    Passenger p = new Passenger(name, surname, busId, mail);
                    bus.getSeats()[seatId].setAvailable(false);
                    bus.getSeats()[seatId].setP(p);
                   // writeToFile();
                   // writeToSeatFile();
                    return true;
                }
            }

        }
        return false;
    }

    public Bus getBusWithId(int id) {

        for (Bus bus : busList) {
            if (bus.getId() == id) {
                return bus;
            }
        }
        return null;
    }

    public boolean addBus(int id, String name, int timeHour, int timeMin, String to, String from,
            boolean wireless, boolean tv, String journeyDate, String returnDate) {
     Bus bus = new Bus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate);
     
        for (int i = 0; i < bus.getSeats().length; i++) {
            BusSeat seat = new BusSeat();
            seat.setAvailable(true);
            seat.setP(null);
            bus.getSeats()[i] = seat;
        }
        if (busList.add(bus)) {
           // writeToFile();
           // writeToSeatFile();
            return true;
        } else {
            return false;
        }

    }

    /**
     * This method do update.
     *
     * @param id
     * @param name
     * @param timeHour
     * @param timeMin
     * @param to
     * @param from
     * @param wireless
     * @param tv
     * @param journeyDate
     * @param returnDate
     * @return
     */
    public boolean updateBus(int id, String name, int timeHour, int timeMin, String to, String from,
            boolean wireless, boolean tv, String journeyDate, String returnDate) {
        for (Bus bus : busList) {
            if (bus.getId() == id) {
                bus.setName(name);
                bus.setTimeHour(timeHour);
                bus.setFrom(from);
                bus.setJourneyDate(journeyDate);
                bus.setReturnDate(returnDate);
                bus.setTimeMin(timeMin);
                bus.setTo(to);
                bus.setTv(tv);
                bus.setWireless(wireless);
                return true;
            }
        }
        return false;
    }

    /**
     *delete method
     * @param id
     * @return
     */
    public boolean deleteBus(int id) {
        for (Bus bus : busList) {
            if (bus.getId() == id) {
                busList.remove(bus);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Bus> getBusList() {
        return busList;
    }

    public void setBusList(ArrayList<Bus> busList) {
        this.busList = busList;
    }

}
