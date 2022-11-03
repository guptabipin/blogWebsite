/*
 this class is for to establish connection between jsp and database
 */
package com.techno.dairy.helper;

import java.sql.*;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {
        try {

            if(con==null)
            {
            //driver class load
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            
            //creating connection
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/tech", "app", "app");
            }
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        return con;
    }

}
