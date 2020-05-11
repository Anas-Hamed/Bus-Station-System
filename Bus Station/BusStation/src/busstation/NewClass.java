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
public class NewClass {
   
    
    public static void main(String args[]){
        
//        Database dp = new Database();
//        dp.connect();
////        dp.insert("Alex", "Cairo", "2018-04-26", "15:40:00", "Bus", 49, "non-stop", "Tarek", 20);
////                dp.insert("Alex", "Cairo", "2018-04-26", "15:40:00", "Bus", 49, "non-stop", "Tarek", 20);
////
////                        dp.insert("Alex", "Cairo", "2018-04-26", "15:40:00", "Bus", 49, "non-stop", "Tarek", 20);
////
////                                dp.insert("Alex", "Cairo", "2018-04-26", "15:40:00", "Bus", 49, "non-stop", "Tarek", 20);
////
////                                        dp.insert("Alex", "Cairo", "2018-04-26", "15:40:00", "Bus", 49, "non-stop", "Tarek", 20);
//
//        dp.delete(1);
//        System.out.println(dp.getNoOfTrips());

Database dp = new Database();
dp.connect();
    dp.getTickets();
    }
}
