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
import java.sql.*;
import java.util.ArrayList;

 
/**33
 *
 * @author sqlitetutorial.net
 */
public class Database {
	
	private Connection conn = null;
	
     /**
     * Connect to a sample database
     */
    public void connect() {
        
        try {
            // database source file URL needed
            String url = "jdbc:sqlite:BusStationDP.dp";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

//            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 

    }
    

    
    public void insert(int tripno , String from,String to,Date date,Time time,String vehicleType,int noOfSeats,String StopType,String DriverName,double Price ) {
        String sql = "INSERT INTO Trips (\n" +
"                      tripno,\n" +
"                      [from],\n" +
"                      [to],\n" +
"                      date,\n" +
"                      time,\n" +
"                      vehicleType,\n" +
"                      noOfSeats,\n" +
"                      stopType,\n" +
"                      driverName,\n" +
"                      price\n" +
"                  )"
                + " VALUES(?,?,?,?,?,?,?,?,?,?)";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, tripno);
            pstmt.setString(2, from);
            pstmt.setString(3, to);
            pstmt.setDate(4, date);
            pstmt.setTime(5, time);
            pstmt.setString(6, vehicleType);
            pstmt.setInt(7, noOfSeats);
            pstmt.setString(8, StopType);
            pstmt.setString(9, DriverName);
            pstmt.setDouble(10, Price);
            

            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void ShowTable(){
        String sql = "SELECT tripno, [from], [to], date, time, vehicleType, noOfSeats, stopType, driverName, price FROM Trips";
        
        
        try (
             Statement stmt  = conn.createStatement();
                
             ResultSet rs    = stmt.executeQuery(sql)){
            // loop through the result set
            while (rs.next()) {
                System.out.println(  rs.getInt("tripno") +  "\t" + 
                                     rs.getString("from") + "\t" +
                                     rs.getString("to") +  "\t" + 
                                     rs.getDate("date").toString() +  "\t" + 
                                     rs.getTime("time").toString() +  "\t" + 
                                     rs.getString("vehicleType") +  "\t" + 
                                     rs.getInt("noOfSeats") +  "\t" + 
                                     rs.getString("StopType") +  "\t" + 
                                     rs.getString("driverName") +  "\t" + 
                                     rs.getDouble("price") +  "\t" 
                        
                                   );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void ShowTrip( int tripno ){
        String sql = "SELECT tripno, [from], [to], date, time, vehicleType, noOfSeats, stopType, driverName, price FROM Trips ";
        
        
        try (
             PreparedStatement pstmt  = conn.prepareStatement(sql)){ 
             pstmt.setDouble(1,tripno);
           
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println(  rs.getInt("tripno") +  "\t" + 
                                     rs.getString("from") + "\t" +
                                     rs.getString("to") +  "\t" + 
                                     rs.getDate("date").toString() +  "\t" + 
                                     rs.getTime("time").toString() +  "\t" + 
                                     rs.getString("vehicleType") +  "\t" + 
                                     rs.getInt("noOfSeats") +  "\t" + 
                                     rs.getString("StopType") +  "\t" + 
                                     rs.getString("driverName") +  "\t" + 
                                     rs.getDouble("price") +  "\t" 
                        
                                   );
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delete(int tripno) {
        String sql = "DELETE FROM Trips WHERE tripno = ?";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, tripno);
            // execute the delete statement
            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
     public void deleteAll () {
        String sql = "DELETE FROM Trips ";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.executeUpdate();
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void updatePrice(int tripno, double newPrice) {
        String sql = "UPDATE Trips SET price = ? "
                + "WHERE tripno = ?";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setDouble(1, newPrice);
            pstmt.setInt(2, tripno);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     public void updateTime (int tripno, Time newTime) {
        String sql = "UPDATE Trips SET time = ? "
                + "WHERE tripno = ?";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setTime(1, newTime);
            pstmt.setInt(2, tripno);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
       public void updateNoOfSeats (int tripno, int noOfSeats) {
        String sql = "UPDATE Trips SET noOfSeats = ? "
                + "WHERE tripno = ?";
 
        try (
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
 
            // set the corresponding param
            pstmt.setInt(1, noOfSeats);
            pstmt.setInt(2, tripno);
            // update 
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    
      public int getNoOfSeats( int tripno ){
        String sql = "SELECT  noOfSeats FROM Trips WHERE tripno = ?";
        
        
        try (
             PreparedStatement pstmt  = conn.prepareStatement(sql)){ 
             pstmt.setDouble(1,tripno);
           
            ResultSet rs  = pstmt.executeQuery();
            
            return rs.getInt("noOfSeats") ;             
                        
        } catch (SQLException e) {
            System.out.println(e.getMessage());
             return -1 ;
        }
    }
        
            public ArrayList<Ticket> getTickets(){
        String sql = "SELECT tripno, [from], [to], date, time, vehicleType, noOfSeats, stopType, driverName, price FROM Trips ";
        
         ArrayList<Ticket> tlist;
        tlist = new ArrayList<>();
        Ticket t ;
        try (
             PreparedStatement pstmt  = conn.prepareStatement(sql)){ 
           
            ResultSet rs  = pstmt.executeQuery();
                   while (rs.next())
                   {
                       t = new Ticket() ;
            t.setTripno(rs.getInt("tripno"));
            t.setFrom(rs.getString("from"));
            t.setTo(rs.getString("to"));
            t.setDate(rs.getDate("date"));
            t.setTime( rs.getTime("time"));
            t.setStopType( rs.getString("StopType"));
            
             Vehicle v = null ;
            switch (rs.getString("vehicleType"))
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
            
            v.setDriver(rs.getString("driverName"));
           
            t.setVehicle(v);
            t.setNoOfAvilableSeats(rs.getInt("noOfSeats"));
            t.setPrice( rs.getDouble("price"));
            
            
            tlist.add(t);
                   }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
             
        }        
        
      return tlist ;
    }
     
            
    public int getNoOfTrips (){
        String sql = "SELECT tripno FROM Trips";
        int c = 0 ;
        
        try (
             PreparedStatement pstmt  = conn.prepareStatement(sql)){ 
            ResultSet rs  = pstmt.executeQuery();
            while (rs.next()) {
               c++ ;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return c ;
    }
             
     public int getFirstTripno (){
        String sql = "SELECT tripno FROM Trips";
        int c;
        try (
             PreparedStatement pstmt  = conn.prepareStatement(sql)){ 
            ResultSet rs  = pstmt.executeQuery();
            c=rs.getInt("tripno");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return -1;
        }
        return c ;
    }
     
      public  ArrayList<Mangers> getManger( ){
        String sql = "SELECT [no],\n" +
"       EmpolyeeId,\n" +
"       Name,\n" +
"       UserName,\n" +
"       password\n" +
"  FROM employees\n" ;
        
         ArrayList<Mangers> mlist;
        mlist = new ArrayList<>();

        Mangers m ;
        try (
                
             PreparedStatement pstmt  = conn.prepareStatement(sql)){            
            ResultSet rs  = pstmt.executeQuery();
                
            while (rs.next())
            {
              m  = new Mangers() ;
            m.setID(rs.getInt("EmpolyeeId"));
            m.setName(rs.getString("Name"));
            m.setUsername(rs.getString("UserName"));
            m.setPassword(rs.getString("password"));
            
            mlist.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
             
        }
        
        return mlist ;
    }
      
    public void disconnect() {

  try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
}
    
    
    
    }
    
    
