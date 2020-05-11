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
public class TripActions implements CustomerAction , EmployeeAction {
    
    DatabaseConnector dbc = new DatabaseConnector();

    public Date SetDate(int day , int month , int year) {
        return Date.valueOf(String.format("%d-%d-%d", year,month,day));
    }

    public Time SetTime(int hour , int minute) {
        return Time.valueOf(String.format("%d:%d:00", hour,minute));
    }

    public Vehicle SetVehicle(String VehicleType) {
            
         Vehicle v = null ;
            switch (VehicleType)
            {
                case "Bus" :
                {  v = new Bus() ;
                        break;}
                case "MiniBus" :
                {  v = new MiniBus(); 
                           break;}
                case "Limousine" :
                {  v = new Limousine();
                           break;}
            }
            
            return v ;
    }

    

        @Override
    public String TripShowText (Ticket t )
    {
        return String.format("Time : %s       Vehicle : %s       Price : %f       Stop Type : %s", t.getTime().toString() , t.getVehicle().getType() ,this.PriceCalculation(t) , t.getStopType()) ;
    }
    
    @Override
    public String TripShowText (Ticket[] t )
    {
        return String.format("Time : %s       Return Time : %s       Vehicle : %s       Return Vehicle : %s       Price : %f", t[0].getTime().toString() , t[1].getTime().toString() ,t[0].getVehicle().getType(), t[1].getVehicle().getType() ,this.PriceCalculation(t) ) ;
    }
    
    @Override
    public void BuyTicket(int tripNo, int NoOfTickets) {
        
        dbc.UpdateBuyTicket(tripNo, NoOfTickets);
    }
    @Override
    public Boolean Login(String userName, String Password) {
        
        ArrayList<Mangers> mList;
        mList = dbc.getMangers();
        int i ;
        for (i=0 ; i< mList.size() ; i++)
        {
            if (mList.get(i).getPassword().equals(Password) && mList.get(i).getUsername().equals(userName))
                return true ;
        }
        return false ;
    }

    @Override
    public void NewTrip(String from, String To, Date date, Time time, Vehicle vehicle, String stopType, String driverName, double price) {
        
        ArrayList<Ticket> tlist;
        tlist = dbc.getTrips();
        
         Ticket t = new Ticket() ;
         
         vehicle .setDriver(driverName);
         
         t.setTripno(tlist.get(tlist.size() - 1).getTripno() + 1); 
         t.setFrom(from);
         t.setTo(To);
         t.setDate(date);
         t.setStopType(stopType);
         t.setTime(time);
         t.setVehicle(vehicle);
         t.setPrice(price);

         t.setNoOfAvilableSeats(vehicle.getNoOfSeats());
         
        tlist.add(t);
        
        dbc.UpdateDatabase(tlist);
    }

    @Override
    public void EditTripPrice(double NewPrice, int tripNo) {
         ArrayList<Ticket> tlist;
        tlist = dbc.getTrips(); 
        int i ;
        for (i=0 ; i< tlist.size() ; i++)
        {
            if (tlist.get(i).getTripno() == tripNo )
            {
                tlist.get(i).setPrice(NewPrice);
                break;
            }
        }
        
        dbc.UpdateDatabase(tlist);
    
    
    }

    @Override
    public void EditTripTime(Time NewTime, int tripNo) {
         ArrayList<Ticket> tlist;
        tlist = dbc.getTrips(); 
        int i ;
        for (i=0 ; i< tlist.size() ; i++)
        {
            if (tlist.get(i).getTripno() == tripNo )
            {
                tlist.get(i).setTime(NewTime);
                break;
            }
        }
        
        dbc.UpdateDatabase(tlist);    }

    @Override
    public void DeleteTrip(int tripNo) {
         ArrayList<Ticket> tlist;
        tlist = dbc.getTrips(); 
        int i ;
        for (i=0 ; i< tlist.size() ; i++)
        {
            if (tlist.get(i).getTripno() == tripNo )
            {
                tlist.remove(i);
                break;
            }
        }
        
        dbc.UpdateDatabase(tlist);    }

    @Override
    public ArrayList<Ticket> ShowAllTrips() {
        return dbc.getTrips();
    }
    
    
    

    @Override
    public ArrayList<Ticket> ShowTrips(String from, String To, Date Date) {
        ArrayList<Ticket> tList;
  
        ArrayList<Ticket> S_result;
        S_result = new ArrayList<> ();
        tList = dbc.getTrips();
        int i ;
        for (i=0 ; i< tList.size() ; i++)
        {
            if (tList.get(i).getFrom().equals(from) && tList.get(i).getTo().equals(To) && tList.get(i).getDate().equals(Date))
                S_result.add(tList.get(i));
        }
        return S_result ;
    }

    @Override
    public ArrayList<Ticket[]> ShowTrips(String from, String To, Date tripDate, Date returnDate) {
        ArrayList<Ticket> tList;
        ArrayList<Ticket> S_result;
        S_result = new ArrayList<> ();
        ArrayList<Ticket[]> S_fresult;
        S_fresult = new ArrayList<> ();
        tList = dbc.getTrips();
        
        Ticket [] t = new Ticket[2] ;
        int i,j ;
        for (i=0 ; i< tList.size() ; i++)
        {
            if (tList.get(i).getFrom().equals(from) && tList.get(i).getTo().equals(To) && tList.get(i).getDate().equals(tripDate))
                S_result.add(tList.get(i));
        }
        
        if (!S_result.isEmpty())
        {
              for (i=0 ; i< tList.size() ; i++)
        {
            for (j=0 ;j< S_result.size() ; j++)
            {
               if (tList.get(i).getFrom().equals(S_result.get(j).getTo()) && tList.get(i).getTo().equals(S_result.get(j).getFrom()) && tList.get(i).getDate().equals(returnDate))
               { t[1]=tList.get(i);
                t[0]=S_result.get(j);
                S_fresult.add(t);
                t = new Ticket[2];
               }
               }
        }
        }
        
        return S_fresult ;  
    }

    @Override
    public double PriceCalculation(Ticket t)       
    {          
        return t.getPrice() * t.getVehicle().getPriceFactor() ; 
    }    

    @Override
    public double PriceCalculation(Ticket[] t) {
                return ((( t[0].getPrice() * t[0].getVehicle().getPriceFactor() ) + ( t[1].getPrice() * t[1].getVehicle().getPriceFactor() )) * 0.9 ) ;

    }

    @Override
    public String TripShowAllText(Ticket t) {
        return String.format("Trip no. : %d       From : %s       To : %s       Date : %s       Time : %s       Vehicle : %s       Stops : %s       Price : %f       Avilable Seats : %d ", t.getTripno() ,t.getFrom() , t.getTo() ,t.getDate().toString() , t.getTime().toString() , t.getVehicle().getType(),t.getStopType(),t.getPrice(),t.getNoOfAvilableSeats()) ;
    }


    
    
    
}
