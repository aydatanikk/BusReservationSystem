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
public class Passenger {
    
    private String name;
    private String surname;
    private int id;
    private String mail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Passenger(String name, String surname, int id, String mail) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.mail = mail;
    }
    
    
}
