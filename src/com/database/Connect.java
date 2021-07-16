package com.database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Connect 
{
    private Connection con;
    private Statement st;
    public Connect()
    {
        try 
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://Database2.mdb");
            st = con.createStatement();
        }
        catch (ClassNotFoundException | SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void closeConnection()
    {
        try 
        {
            st.close();
            con.close();
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
