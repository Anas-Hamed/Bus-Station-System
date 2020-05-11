/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

/**
 *
 * @author wadiebishoy
 */
public abstract class Vehicle {
    
    protected int noOfSeats ;
    protected double priceFactor ;
    protected String Type ;
    private String Driver ;

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public double getPriceFactor() {
        return priceFactor;
    }

    public String getType() {
        return Type;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String Driver) {
        this.Driver = Driver;
    }
   
}
