/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busstation;

import java.util.ArrayList;

/**
 *
 * @author wadiebishoy
 */
public class DatabaseConnector {
    
    Database db = new Database();

    public DatabaseConnector() {
        db.connect();
    }
    

    public ArrayList<Ticket> getTrips ()
    {       
        return db.getTickets() ;
    }
        public ArrayList<Mangers> getMangers ()
    {
        return db.getManger() ;
    }
        
        
    public void UpdateBuyTicket (int tripNo, int NoOfTickets){
    db.updateNoOfSeats(tripNo, (db.getNoOfSeats(tripNo)-NoOfTickets));
}
    
    public void UpdateDatabase (ArrayList<Ticket> t)
    {
        db.deleteAll();
        int i;
        for (i=0 ; i<t.size() ; i++ )
        {
           db.insert(t.get(i).getTripno(), t.get(i).getFrom(), t.get(i).getTo(), t.get(i).getDate(), t.get(i).getTime(), t.get(i).getVehicle().getType(), t.get(i).getNoOfAvilableSeats(), t.get(i).getStopType(), t.get(i).getVehicle().getDriver(), t.get(i).getPrice());
        }
    }
    
}
