/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author wadiebishoy
 */
public class Ticket {
    
    private int tripno ;
    private String From ;
    private String To ;
    private String stopType ;
    private Vehicle vehicle ;
    private Date date ;
    private Time time ;
    private int NoOfAvilableSeats ;
    private double price ;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int getNoOfAvilableSeats() {
        return NoOfAvilableSeats;
    }

    public void setNoOfAvilableSeats(int NoOfAvilableSeats) {
        this.NoOfAvilableSeats = NoOfAvilableSeats;
    }
    
    public int getTripno() {
        return tripno;
    }

    public void setTripno(int tripno) {
        this.tripno = tripno;
    }
     

    public String getFrom() {
        return From;
    }

    public void setFrom(String From) {
        this.From = From;
    }

    public String getTo() {
        return To;
    }

    public void setTo(String To) {
        this.To = To;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    
    
}
