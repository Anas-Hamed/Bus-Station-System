/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author wadiebishoy
 */
public interface CustomerAction {
    
        public Date SetDate(int day , int month , int year);
         public Time SetTime(int hour , int minute);
         public Vehicle SetVehicle(String VehicleType);
         String TripShowText (Ticket t );
         String TripShowText (Ticket[] t );

 
    
        void BuyTicket ( int tripNo , int NoOfTickets );
        
        ArrayList<Ticket> ShowTrips ( String from , String To , Date Date );
        ArrayList<Ticket[]> ShowTrips ( String from , String To , Date tripDate , Date returnDate );

        double PriceCalculation ( Ticket t );
        double PriceCalculation ( Ticket [] t );

}
