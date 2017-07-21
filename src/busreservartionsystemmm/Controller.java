/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservartionsystemmm;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayda
 */
public class Controller {

    public Model m;
    public View v;

    public Controller(Model m, View w) {
        this.m = m;
        this.v = w;
        this.v.listenerButton(new searchListener());
        this.v.listeneraddButton(new addListener());
        this.v.listenerdeleteButton(new deleteListener());
        this.v.listenerloginButton(new loginListener());
        this.v.listenerupdateButton(new updateListener());
        this.v.selectButtonListener(new selectButtonListener());

    }

    class selectButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            BusView bv = new BusView();
            bv.setVisible(true);
            int busId = v.getSelectBusId();
            Bus b = m.getBusWithId(busId);
            BusSeat[] seats = b.getSeats();
            JLabel[] labels = bv.getSeat();

            for (int i = 0; i < labels.length; i++) {
                if (seats[i].isAvailable()) {
                    labels[i].setForeground(Color.green);

                } else {
                    labels[i].setForeground(Color.red);
                }

            }
            bv.busSelectSeatListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    int seatId = bv.getSeatId();
                    String name = bv.getPassengerName();
                    String surname = bv.getPassengerSurname();
                    String id = bv.getPassengerId();
                    String mail = bv.getPassengerMail();
                    if (seats[seatId].isAvailable()) {
                        if (m.buySeat(busId, seatId, name, surname, 4, mail)) {
                            JOptionPane.showMessageDialog(null, "Okey");
                            // v.getBusView().setVisible(true);
                            for (int i = 0; i < labels.length; i++) {
                                if (seats[i].isAvailable()) {
                                    labels[i].setForeground(Color.green);

                                } else {
                                    labels[i].setForeground(Color.red);
                                }

                            }

                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Please Select Another Seat !");
                    }

                }
            });

        }

    }

    class searchListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            String from = v.getFrom();
            String to = v.getTo();
            String journey = v.getDateOfJourney();
            String return1 = v.getDateOfReturn();
            if (!journey.equals("NULL") && !return1.equals("NULL")) {
                DefaultTableModel table = (DefaultTableModel) v.getSearchTable().getModel();
                table.setRowCount(0);
                for (int i = 0; i < m.getBusList().size(); i++) {
                    Bus bus = m.getBusList().get(i);
                    if (bus.getFrom().equals(from) && bus.getTo().equals(to) && bus.getJourneyDate().equals(journey) && bus.getReturnDate().equals(return1)) {
                        table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                            bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});
                    }

                }
                v.getSearchTable().setModel(table);
                v.getBusView().setVisible(true);
                v.getTicketView().setVisible(false);
                System.out.println("");

            } else {
                JOptionPane.showMessageDialog(null, "Please select date !!");
            }

        }
    }

    class addListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            DefaultTableModel table = (DefaultTableModel) v.getBusTable().getModel();
            table.setRowCount(0);
            for (int i = 0; i < m.getBusList().size(); i++) {
                Bus bus = m.getBusList().get(i);

                table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                    bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});

            }
            v.getBusTable().setModel(table);

            int id = v.getBusId();
            String name = v.getBusName();
            int timeHour = v.getTimeHour();
            int timeMin = v.getTimeMin();
            String to = v.getToBus();
            String from = v.getFromBus();
            boolean wireless = v.getWireless();
            boolean tv = v.getTv();
            String journeyDate = v.getDateOfJourney2();
            String returnDate = v.getDateOfReturn2();
             if( id<=0){
             JOptionPane.showMessageDialog(null, "Please enter positive number !");
         }
             else{
                 
             
            if (m.addBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate)) {
                JOptionPane.showMessageDialog(null, "SUCCESFULL");
                table = (DefaultTableModel) v.getBusTable().getModel();
                table.setRowCount(0);
                for (int i = 0; i < m.getBusList().size(); i++) {
                    Bus bus = m.getBusList().get(i);
                    table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                        bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});

                }
                v.getBusTable().setModel(table);
            } else {
                JOptionPane.showMessageDialog(null, "UNSUCCESFULL");
            }
             }
        }

    }

    class deleteListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int x = v.getDeleteId();
            boolean delete = m.deleteBus(x);
            if (x == -1) {
                JOptionPane.showMessageDialog(null, "Please Select One Row in the Table");
            } else if (delete) {
                JOptionPane.showMessageDialog(null, "Deleted");
                DefaultTableModel table = (DefaultTableModel) v.getBusTable().getModel();
                table.setRowCount(0);
                for (int i = 0; i < m.getBusList().size(); i++) {
                    Bus bus = m.getBusList().get(i);

                    table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                        bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});

                }
                v.getBusTable().setModel(table);
            }

        }

    }

    class updateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int id = v.getUpdateId();
            if (id != -1) {
                v.getManagerPage().setVisible(false);
                v.getUpdatePage().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "SELECT ROW !!");
            }

            v.update_button2Listener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String name = v.getBusNameUpdate();
                    int timeHour = v.getTimeHourUpdate();
                    int timeMin = v.getTimeMinUpdate();
                    String to = v.getToBusUpdate();
                    String from = v.getFromBusUpdate();
                    boolean wireless = v.getWirelessUpdate();
                    boolean tv = v.getTvUpdate();
                    String journeyDate = v.getDateOfJourney2Update();
                    String returnDate = v.getDateOfReturn2Update();
                    if (m.updateBus(id, name, timeHour, timeMin, to, from, wireless, tv, journeyDate, returnDate)) {
                        JOptionPane.showMessageDialog(null, "SUCCESFULL");
                        DefaultTableModel table = (DefaultTableModel) v.getBusTable().getModel();
                        table.setRowCount(0);
                        for (int i = 0; i < m.getBusList().size(); i++) {
                            Bus bus = m.getBusList().get(i);
                            table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                                bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});

                        }
                        v.getBusTable().setModel(table);
                    } else {
                        JOptionPane.showMessageDialog(null, "UNSUCCESFULL!!!");
                    }
                }
            });

        }
    }

    class loginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String username = v.getUsername();
            String pass = v.getPassword();

            if (username.equals("manager") && pass.equals("123")) {
                JOptionPane.showMessageDialog(null, "Login True");
                DefaultTableModel table = (DefaultTableModel) v.getBusTable().getModel();
                table.setRowCount(0);
                for (int i = 0; i < m.getBusList().size(); i++) {
                    Bus bus = m.getBusList().get(i);

                    table.addRow(new Object[]{bus.getId(), bus.getName(), bus.getTimeHour(), bus.getTimeMin(), bus.getFrom(),
                        bus.getTo(), bus.getJourneyDate(), bus.getReturnDate(), (bus.isWireless() == true) ? "Yes" : "No", (bus.isTv() == true) ? "Yes" : "No"});

                }
                v.getBusTable().setModel(table);
                v.getManagerLogin().setVisible(false);
                v.getManagerPage().setVisible(true);

            } else {
                JOptionPane.showMessageDialog(null, "Login False Try Again !");
            }
        }

    }

}
