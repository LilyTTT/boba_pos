//package control;
//
//import control.dbSetup;
//import java.sql.*;
//
//public class jdbcpostgreSQL {
//    public static void main(String args[]) {
//        
//    
//    }
//	public String status = "Not Connected";
//	
//	public Connection connect() {
//            Connection conn = null;
//            String dbName = "csce315331_08g_db";
//            String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
//            dbSetup myCredentials = new dbSetup(); 
//
//            //Connecting to the database
//            try {
//                conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
//            } 
//            catch (Exception e) {
//                status = "Connection unsuccessful";
//                e.printStackTrace();
//                System.err.println(e.getClass().getName()+": "+e.getMessage());
//            }
//            
//            status = "Opened database successfully";
//
//            return conn;
//	}
//}

package control;

import control.dbSetup;
import java.sql.*;

public class jdbcpostgreSQL {
    public String status = "Not Connected";

    public Connection connect() {
        Connection conn = null;
        String dbName = "csce315331_08g_db";
        String dbConnectionString = "jdbc:postgresql://csce-315-db.engr.tamu.edu/" + dbName;
        dbSetup myCredentials = new dbSetup();

        // Connecting to the database
        try {
            conn = DriverManager.getConnection(dbConnectionString, dbSetup.user, dbSetup.pswd);
        } catch (Exception e) {
            status = "Connection unsuccessful";
            e.printStackTrace();
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }

        status = "Opened database successfully";

        return conn;
    }

    public static void main(String[] args) {
        jdbcpostgreSQL myApp = new jdbcpostgreSQL();
        Connection connection = myApp.connect();

        if (connection != null) {
            System.out.println("Connection successful!");

            // Create an instance of the GUI and start it
            GUI gui = new GUI();
            gui.startGUI();
        } else {
            System.out.println("Connection failed.");
        }
    }
}
